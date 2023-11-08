import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AffichageDetails implements AffichageBehavior {

    public void afficherProfil(Utilisateur user) {
        System.out.println("Nom : " + user.getNom());
        System.out.println("Prenom : " + user.getPrenom());

        // Obtenez la date de début et de fin de la semaine
        LocalDate dateDebutSemaine = LocalDate.now().with(DayOfWeek.MONDAY);
        LocalDate dateFinSemaine = dateDebutSemaine.plusDays(6);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateDebutSemaineFormatted = dateDebutSemaine.format(formatter);
        String dateFinSemaineFormatted = dateFinSemaine.format(formatter);

        user.afficherPlanning(dateDebutSemaineFormatted, dateFinSemaineFormatted);
        
        if (user instanceof Etudiant) {
            Etudiant etudiant = (Etudiant) user;
            System.out.println("\n");
            System.out.println("------ Travaux à rendre pour la semaine la semaine :");
            List<Matiere> matieresInscrites = etudiant.getListeMatieres();

            for (Matiere matiere : matieresInscrites) {
                for (RepertoireDepot repertoire : matiere.getListeRepertoires()) {
                    if (isDateWithinWeek(repertoire.getLimiteRendu())) {
                        System.out.printf("Répertoire ouvert pour %s : %s - date limite : %s", matiere.getNom(), repertoire.getTitre(), repertoire.getLimiteRendu());
                    }
                }
            }

            System.out.println("\n");
            System.out.println("------ Dernières notes reçues depuis une semaine :");
            List<Depot> depots = etudiant.getListeDepots();
            LocalDate uneSemaineAvant = LocalDate.now().minusWeeks(1);

            for (Depot depot : depots) {
                Note note = depot.getNote();
                if (note != null) {
                    LocalDate dateNote = LocalDate.parse(note.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    if (dateNote.isAfter(uneSemaineAvant) || dateNote.isEqual(uneSemaineAvant)) {
                        System.out.printf("Note reçue pour le depot %s : %s.", depot.getTitre(), note.getNote());
                    }
                }
            }
        }
    }

    private boolean isDateWithinWeek(String date) {
        LocalDate dateLimite = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate dateDebutSemaine = LocalDate.now().with(DayOfWeek.MONDAY);
        LocalDate dateFinSemaine = dateDebutSemaine.plusDays(6);
        return !dateLimite.isBefore(dateDebutSemaine) && !dateLimite.isAfter(dateFinSemaine);
    }
}