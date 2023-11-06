import java.util.List;

public class Utilisateur {
    private static int nextId = 1;
    private int id;
    private String nom;
    private String prenom;
    Specialites allSpecialities = new Specialites();
    List<Specialite> specialitiesList = allSpecialities.getSpecialities();
    private AffichageBehavior affichage;
    private Planning planning;
    
    public Utilisateur(String nom, String prenom) {
        this.nom = nom; 
        this.prenom = prenom;
        this.id = nextId;
        nextId ++;
    }

    public void assignePlaning(Planning planing){
        this.planning = planing;
    }

    public void afficherProfil() {
        System.out.println("Ulisateur: > Id: "+id+" Nom: "+nom+" Prenom: "+prenom+" Prenom: "+prenom);
    }

    public void afficherPlanning() {
        System.out.println("Afichage Planning");
    }
    public void deposerDoc(RepertoireDepot rep ,Depot depot , Document doc) {
       rep.getDepot(depot).loadDocument(doc);
    }
    public void affichage() {
        System.out.println("Afichage");
    }
    public boolean checkSpecialityExists(String speciality) {
        for (Specialite spec : specialitiesList) {
            if (spec.getName().equals(speciality)) {
                return true;
            }
        }
        return false;
    }
    /**
    public void specialite(String specialite){
        if (checkSpecialityExists(specialite)) {
            this.specialite = specialite;
        } else {
            System.out.println("Specialite does not exist.");
        }
    }
     **/
    public String getSpeciality(String specialite){
        return specialite;
    }
}