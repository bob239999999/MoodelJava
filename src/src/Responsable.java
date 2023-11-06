import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Responsable extends Utilisateur{
    Responsable instance;
    List<Etudiant> listetudiant = new ArrayList<>();

    public Responsable(String nom, String prenom){
        super(nom,prenom);
    }

    public Responsable getRespoInstance() {
   		if (instance == null) {
   			instance = new Responsable("NoResponsable","NoResponsable");
    	}
    	return(instance);
    }

    public void planifierCours(Matiere ma, Professor prof, Date date, String sale) {

    }

    public void annulerCours(Cours cours) {

    }

    public void inscrireEtudiantMat(Etudiant etu, Matiere ma) {

    }

    public void desinscrireEtudiantMat(Etudiant etu, Matiere ma) {

    }
}