import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Professer extends Utilisateur {
    ArrayList<Observer> observers;

    public Professer(String nom, String prenom) {
        super(nom, prenom);
    }

    public void removeObserver() {
    }

    public void registerObserver() {
    }

    public void notifyObserver() {
    }

    public void addDocMat(Matiere mat, Document doc) {
    }

    public void addCorrection(Depot dep) {
    }

    public void noter(Depot dep, float note) {
    }

    public void editAvancement(float av) {
    }

    public void calcMoyMat(Matiere mat) {
    }
    
}