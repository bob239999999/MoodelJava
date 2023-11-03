import java.util.Date;

public class Responsable {
    Responsable instance;

    private Responsable() {}

    public Responsable getRespoInstance() {
   		if (instance == null) {
   			instance = new Responsable();
    	}
    	return(instance);
    }

    public void planifierCours(Matiere ma, Professer prof, Date date, String sale) {

    }

    public void annulerCours(Cours cours) {

    }

    public void inscrireEtudiantMat(Etudiant etu, Matiere ma) {

    }

    public void desinscrireEtudiantMat(Etudiant etu, Matiere ma) {

    }
}