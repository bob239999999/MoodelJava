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
        Planning planning0 = new Planning();
        Planning planning1 = new Planning();

        // Create Matiere
        Matiere Geography = new Matiere("geography","Les etude de la geo");
        Matiere Science = new Matiere("science","Les etude de la science");
        Matiere Chimie = new Matiere("chimie","Les etude de la chimie");

        // Creation des cours
        Cours cours = new Cours("12-02-2001","16:00", Geography);
        Cours cours1 = new Cours("12-02-2001","11:00", Science);
        Cours cours2 = new Cours("12-02-2001","13:00", Chimie);
        Cours cours3 = new Cours("12-02-2001","13:00", Geography);
        Cours cours4 = new Cours("12-02-2001","11:00", Science);
        Cours cours5 = new Cours("12-02-2001","19:00", Chimie);

        // Fill Planning
        planning0.addCours(cours);
        planning0.addCours(cours1);
        planning0.addCours(cours2);
        planning1.addCours(cours3);
        planning1.addCours(cours4);
        planning1.addCours(cours5);

        // Visualise Planning 0
        List<Cours> planningCours = planning0.getCoursList();

        for (Cours c : planningCours) {
            System.out.println("Course: " + c.getMatiere().getNom() + " at " + c.getHeure());
        }

        // Visualise  Planning 1
        List<Cours> planningCours1 = planning1.getCoursList();

        for (Cours c : planningCours1) {
            System.out.println("Course: " + c.getMatiere().getNom() + " at " + c.getHeure());
        }

        // Assigne planning
        user1.assignePlaning(planning0);
        user2.assignePlaning(planning1);

        // Creat Repertoire de Depot and Depot
        RepertoireDepot rep1 = new RepertoireDepot("Handel IDU","12-01-2024");
        Depot depot = new Depot("12-01-2024", "Miniproject");
        rep1.addDepot(depot);

        // Create a document to apload
        Document doc = new Document("Raport");

        // Student apload a document
        rep1.getDepot(depot).loadDocument(doc);
    }
}