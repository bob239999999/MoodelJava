import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Utilisateur{
    private String specialite;
    public Etudiant(String nom, String prenom){
        super(nom,prenom);
    }
    public void addSpeciality(String speciality) {
        specialite= specialite;
    }
    public String getSpecialities() {
        return specialite;
    }
}