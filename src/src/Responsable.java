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

    public void planifieCours(Matiere ma, Professer prof, Date date, String sale) {

    }

    public void annuleCours(Cours cours) {

    }

    public void inscrireEtudiantMat(Etudiant etu, Matiere ma) {

    }

    public void decrireEtudiantMat(Etudiant etu, Matiere ma) {

    }
}