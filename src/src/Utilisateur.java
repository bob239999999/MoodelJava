import java.util.List;

public class Utilisateur {
    private static int nextId = 1;
    private int id;
    private String nom;
    private String prenom;
    Specialities allSpecialities = new Specialities();
    List<Speciality> specialitiesList = allSpecialities.getSpecialities();
    private String specialite = "NoSpeciality";
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
        System.out.println("Ulisateur: > Id: "+id+" Nom: "+nom+" Prenom: "+prenom+" Specialite: "+specialite );
    }

    public void afficherPlanning() {

    }
    public void deposerDoc(RepertoireDepot rep, Document doc) {

    }
    public void affichage() {
    }
    public boolean checkSpecialityExists(String speciality) {
        for (Speciality spec : specialitiesList) {
            if (spec.getName().equals(speciality)) {
                return true;
            }
        }
        return false;
    }
    public void specialite(String specialite){
        if (checkSpecialityExists(specialite)) {
            this.specialite = specialite;
        } else {
            System.out.println("Speciality does not exist in the list.");
        }
    }
    public String getSpeciality(String specialite){
        return specialite;
    }

}
