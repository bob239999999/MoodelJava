import java.sql.SQLClientInfoException;
import java.util.List;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        // Procesus d'inscription dois etre lie a le project de inscription
        Etudiant user1 = new Etudiant("Rosine","Soro");
        user1.specialite("IDU");
        Etudiant user2 = new Etudiant("Manon","Pianist");
        user2.specialite("SNI");
        user1.afficherProfil();
        user2.afficherProfil();

        // Afiche planning
        Planning planning = new Planning();

        // Create Matiere
        Matiere Geography = new Matiere("geography","Les etude de la geo");
        Matiere Science = new Matiere("science","Les etude de la science");
        Matiere Chimie = new Matiere("chimie","Les etude de la chimie");

        // Creation des cours
        Cours cours = new Cours("12-02-2001","16:00", Geography);
        Cours cours1 = new Cours("12-02-2001","11:00", Science);
        Cours cours2 = new Cours("12-02-2001","13:00", Chimie);

        // Fill Planning
        planning.addCours(cours);
        planning.addCours(cours1);
        planning.addCours(cours2);

        List<Cours> planningCours = planning.getCoursList();

        for (Cours c : planningCours) {
            System.out.println("Course: " + c.getMatiere().getNom() + " at " + c.getHeure());
        }

    }
}