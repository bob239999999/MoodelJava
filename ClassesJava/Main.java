
public class Main {
    public static void main(String[] args) {
        // Create instances of various classes
    	Responsable responsable = Responsable.getInstance();
        Planning planning = Planning.getInstance();
        Etudiant student = new Etudiant("Alice", "Johnson");
        Professeur professor = new Professeur("Dr. Smith", "John");
        Matiere MATH700 = new Matiere("MATH700", "Introduction to Calculus", professor);
        Matiere INFO700 = new Matiere("INFO700", "Introduction to Programming", professor);
        student.getListeMatieres().add(INFO700);
        student.getListeMatieres().add(MATH700);
        professor.addObserver(student);

        // Create and assign documents to the matières
        DocCours mathDoc = new DocCours("Mathematics course content");
        professor.addDocMat(MATH700, mathDoc);
        DocCours csDoc = new DocCours("Computer Science course content");
        professor.addDocMat(INFO700, csDoc);

        // Create courses
        CM mathCourse = new CM("2023-11-08", "10:00 AM", MATH700, professor);
        TD tutorial = new TD("2023-11-10", "02:00 PM", MATH700, professor);
        TP practicalWork = new TP("2023-11-11", "04:00 PM", INFO700, professor);
        planning.addCours(mathCourse);
        planning.addCours(tutorial);
        planning.addCours(practicalWork);

        // Create and assign a student's work
        TravailEtudiant studentWork = new TravailEtudiant(student, "This is the student's work.");

        // Create a depot
        professor.ouvrirRepDepot(INFO700, "Dépôts TP1", "Déposez vos comptes-rendu ici", "2023-11-10");
        //Depot depot = new Depot("2023-11-15", studentWork);
        RepertoireDepot repertoire = INFO700.getListeRepertoires().get(0);
        student.deposerTravailEtu("StudentWork", repertoire, studentWork);

        // Create and assign a correction
        Correction correction = new Correction("This is the correction for the student's work.");
        Depot depot1 = repertoire.getListeDepots().get(0);
        professor.addCorrection(depot1, correction);

        // Create and assign a note to the student's work
        //Note note = new Note(85.5f, depot, student, mathMatiere);
        professor.noter(depot1, 14);

        // Display the student's profile using a specific affichage behavior
        student.setAffichageBehavior(new AffichageDetails());
        student.afficherProfil();
    }
}