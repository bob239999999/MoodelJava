import java.util.ArrayList;

public class Responsable extends Utilisateur {


    private static Responsable instance;
    private ArrayList<Utilisateur> listeUsers;

    private Responsable() {
        super("Favreliere", "Hugues");
    }

    public static Responsable getInstance() {
        if (instance == null) {
            instance = new Responsable();
        }
        return(instance);
    }

    public ArrayList<Utilisateur> getListeUsers(){
        return listeUsers;
    }

    public void addUser(Utilisateur u){
        listeUsers.add(u);
    }

    public void removeUser(Utilisateur u){
        listeUsers.remove(u);
    }


    public void planifierCours(Matiere m, Professeur prof, String date) {

    }

    public void annulerCours(Cours cours) {

    }

    public void inscrireEtudiantMat(Etudiant etu, Matiere ma) {

    }

    public void desinscrireEtudiantMat(Etudiant etu, Matiere ma) {

    }

    @Override 
    public void afficherPlanning(String dateDeb){System.out.println("Pas d'affichage disponible pour le moment.");}

    @Override
    public void afficherPlanning(String dateDeb, String dateFin){System.out.println("Pas d'affichage disponible pour le moment.");}
}