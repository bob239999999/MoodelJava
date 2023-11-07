public class Utilisateur {
    private static int nextId = 1;
    private int id;
    private String nom;
    private String prenom;
    private AffichageBehavior affichageBehavior;
    
    public Utilisateur(String nom, String prenom) {
        this.nom = nom; 
        this.prenom = prenom;
        this.id = nextId;
        nextId ++;
        this.affichageBehavior = new SansAffichage();
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String p) {
        this.prenom = p;
    }

    public AffichageBehavior getAffichageBehavior() {
        return affichageBehavior;
    }

    public void setAffichageBehavior(AffichageBehavior a) {
        this.affichageBehavior = a;
    }

    
    public void afficherProfil() {
        affichageBehavior.afficherProfil(this);
    }

    public void afficherPlanning(String dateDeb, String dateFin) {
        //
    }

    public void afficherPlanning(String dateDeb) {
        //
    }

}