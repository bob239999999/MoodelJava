import java.util.ArrayList;
import java.util.List;

public class Professeur extends Utilisateur {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private ArrayList<Matiere> listeMatieres;

    public Professeur(String nom, String prenom) {
        super(nom, prenom);
        this.listeMatieres = new ArrayList<Matiere>();
    }

    public ArrayList<Observer> getObservers(){
        return this.observers;
    }

    public void addMatiere(Matiere mat){
        this.listeMatieres.add(mat);
    }
    
    public ArrayList<Matiere> getMatieres(){
        return this.listeMatieres;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserversNewRep(Matiere mat) {
        for (Observer observer : observers) {
            observer.updateNewRep(mat); 
        }
    }
        
    public void notifyObserversNewDoc(Matiere mat) {
        for (Observer observer : observers) {
            observer.updateNewDoc(mat);
        }
    }

    public void addDocMat(Matiere mat, DocCours d) {
        if (this.listeMatieres.contains(mat)){
            mat.addDocCours(d);
            notifyObserversNewDoc(mat);
        } else {
            System.out.println("Vous n'avez pas la permission d'ajouter un document pour cette matière.");
        }

    }

    public void addCorrection(Depot dep, Correction c) {
    	Matiere mat = dep.getRepDepot().getMatiere();
        if (this.listeMatieres.contains(mat)){
            dep.setCorrection(c);
            notifyObserversNewDoc(mat);
        } else {
            System.out.println("Vous n'avez pas la permission d'ajouter une correction dans cette matière.");
        }
    }

    public void noter(Depot dep, float x) {
        if (this.listeMatieres.contains(dep.getRepDepot().getMatiere())){
            Note note = new Note(x, dep, dep.getEtu(), dep.getRepDepot().getMatiere());
            dep.setNote(note);
        } else {
            System.out.println("Vous n'avez pas la permission de noter ce travail.");
        }
    }

    public void editAvancement(Matiere m, float x) {
        if (this.listeMatieres.contains(m)){
            m.setAvancement(x);
        } else {
            System.out.printf("Vous n'avez pas la permission d'éditer l'avancement de la matière %s. ", m.getNom());
        }
    }

    public Float calcMoyMat(Matiere m) {
        if (this.listeMatieres.contains(m)) {
            List<Note> notes = m.getListeNotes();
            if (notes.isEmpty()) {
                System.out.println("Pas encore de note disponible pour calculer la moyenne de cette matière.");
                return null;
            } else {
                float x = 0;
                int n = 0;
                for (Note note : notes) {
                    n++;
                    x += note.getNote();
                }
                return x / n;
            }
        } else {
            System.out.printf("Vous n'avez pas la permission de calculer la moyenne pour la matière %s.", m.getNom());
            return null;
        }
    }

    public void calcMoyEtu(Etudiant etu, Matiere m) {
        if (this.listeMatieres.contains(m)) {
            List<Note> notes = m.getListeNotes();
            if (notes.isEmpty()) {
                System.out.printf("L'étudiant %s n'a pas encore de note pour la matière %s", etu.getNom() + etu.getPrenom(), m.getNom());
            } else {
                float x = 0;
                int n = 0;
                for (Note note : notes) {
                    if (note.getEtudiant() == etu) {
                        n++;
                        x += note.getNote();
                    }
                }
                Bulletin bulletin = etu.getBulletin();
                bulletin.setMoyenneMatiere(m, x / n);
            }
        } else {
            System.out.printf("Vous n'avez pas la permission de calculer la moyenne pour la matière %s.", m.getNom());
        }
    }

    public void ouvrirRepDepot(Matiere mat, String titre, String description, String dateLimite) {
        RepertoireDepot rep = new RepertoireDepot(mat, titre, description, dateLimite);
        mat.addRepDepot(rep);
        notifyObserversNewRep(mat);
    }
}

