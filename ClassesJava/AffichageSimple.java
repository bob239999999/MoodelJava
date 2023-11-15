import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AffichageSimple implements AffichageBehavior {
    public void afficherProfil(Utilisateur user) {
        System.out.println("Nom : " + user.getNom());
        System.out.println("Prenom : " + user.getPrenom());

        // Obtenez la date du jour au format yyyymmdd
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateFormatted = date.format(formatter);
        user.afficherPlanning(dateFormatted);

        if (user instanceof Etudiant) {
            Etudiant etudiant = (Etudiant) user;
            System.out.println("\n");
            System.out.println("------ Travaux à rendre aujourd'hui :");

            for (Matiere matiere : etudiant.getListeMatieres()) {
                if (matiere.getListeRepertoires() != null) {
                    for (RepertoireDepot repertoire : matiere.getListeRepertoires()) {
                        if (repertoire.getLimiteRendu().equals(dateFormatted)) {
                            System.out.printf("Répertoire ouvert pour %s : %s - date limite : %s", matiere.getNom(), repertoire.getTitre(), repertoire.getLimiteRendu());
                        }
                    }
                }
            }
        }
    }
}
