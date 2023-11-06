import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Utilisateur{
    private String spe;
    private ArrayList<TravailEudiant> listeTravauxEtu;

    public Etudiant(String nom, String prenom){
        super(nom,prenom);
    }

    public String getSpecialities() {
        return spe;
    }

    public void addTravailEtu(TravailEudiant travail){
        this.listeTravauxEtu.add(travail);
    }
}