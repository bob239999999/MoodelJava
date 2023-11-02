public class Utilisateur {
    String nom;
    String prenom;
    int id = 0;
    AffichageBehavior affichage;
    Planning planing;
    
    public Utilisateur(String nom, String prenom) {
        this.nom = nom; 
        this.prenom = prenom;
        this.id = id + id; 
        id++;
    }
    public void assignePlaning(Planning planing){
        this.planing = planing;
    }
    public void afficherProfil() {
        System.out.println("Ulisateur: > Id: "+id+" Nom: "+nom+" Prenom: "+prenom);
    }

    public void afficherPlanning() {

    }
    public void deposerDoc(RepertoireDepot rep, Document doc) {

    }
    public void affichage() {
    }
}
