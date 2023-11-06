import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Professor extends Utilisateur {

    ArrayList<Observer> observers;

    public Professor(String nom, String prenom) {
        super(nom, prenom);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Object data) {
        for (Observer observer : observers) {
            observer.update((Observable) observer,data); // Pass the required data to the update method
        }
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

