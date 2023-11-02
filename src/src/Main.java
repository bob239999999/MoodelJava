public class Main {
    public static void main(String[] args) {
        // Procesus d'inscription dois etre lie a le project de inscription
        Utilisateur utilisateur1 = new Utilisateur("Manon","Pianist");
        utilisateur1.afficherProfil();
        // Afiche planning
        Planning planning = new Planning();
        // Create Matiere
        Matiere Geography = new Matiere("geography","Les etude de la geo");
        // Creation des cours
        Cours cours = new Cours(12-02-2001,"16:00", Geography);
        //
        planning.createList();
    }
}