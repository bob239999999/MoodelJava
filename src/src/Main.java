import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        // Responsable
        Responsable responsable  = new Responsable("Albert","Camu");

        // Procesus d'inscription dois etre lie a le project de inscription
        Etudiant etudiant1 = new Etudiant("Doe", "John");
        Etudiant etudiant2 = new Etudiant("Smith", "Alice");
        Etudiant etudiant3 = new Etudiant("Johnson", "Bob");
        Etudiant etudiant4 = new Etudiant("Rosa","Soro");
        Etudiant etudiant5 = new Etudiant("Manon","Pianist");

        responsable.listetudiant.add(etudiant1);
        responsable.listetudiant.add(etudiant2);
        responsable.listetudiant.add(etudiant3);

        // Procesus d'inscription dois etre lie a le project de inscription
        //user1.specialite("IDU");
        //user1.addSpeciality("IDU");
        //user2.specialite("SNI");
        //user1.addSpeciality("SNI");
        etudiant4.afficherProfil();
        etudiant5.afficherProfil();


        // Afiche planning
        Planning planning = new Planning();

        // Create Matiere
        Matiere INFO1 = new Matiere("geography","Les etude de la geo");
        Matiere INFO2 = new Matiere("science","Les etude de la science");
        Matiere INFO3 = new Matiere("chimie","Les etude de la chimie");

        // Creation des cours
        Cours cours = new Cours("2023-12-01","16:00",  INFO1);
        Cours cours1 = new Cours("2023-12-02","11:00", INFO2);
        Cours cours2 = new Cours("2023-12-03","13:00", INFO3);
        Cours cours3 = new Cours("20023-12-01","13:00", INFO1);
        Cours cours4 = new Cours("2023-12-02","11:00", INFO2);
        Cours cours5 = new Cours("2023-12-03","19:00", INFO3);

        // Fill Planning
        planning.addCours(cours);
        planning.addCours(cours1);
        planning.addCours(cours2);
        planning.addCours(cours3);
        planning.addCours(cours4);
        planning.addCours(cours5);

        // Do a selection buy a specific date
        List<Cours> list = new ArrayList<>();
        list = planning.getdate("2023-12-01");
        System.out.println(list);
        /**

        // Visualise Planning 0
        List<Cours> planningCours = planning.getCoursList();

        for (Cours c : planningCours) {
            System.out.println("Course: " + c.getMatiere().getNom() + " at " + c.getHeure());
        }

        // Visualise  Planning 1
        List<Cours> planningCours1 = planning.getCoursList();

        for (Cours c : planningCours1) {
            System.out.println("Course: " + c.getMatiere().getNom() + " at " + c.getHeure());
        }

        // Assigne planning
        user1.assignePlaning(planning);
        user2.assignePlaning(planning1);

        // Creat Repertoire de Depot and Depot
        RepertoireDepot rep1 = new RepertoireDepot("Handel IDU","12-01-2024");
        Depot depot = new Depot("12-01-2024", "Miniproject");
        rep1.addDepot(depot);

        // Create a document to apload
        Document doc = new Document("Raport");

        // Student apload a document
        rep1.getDepot(depot).loadDocument(doc);
         **/
    }
}
