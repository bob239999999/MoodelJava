import java.util.HashMap;

public class Bulletin {

    private HashMap<Matiere, Float> moyenneParMatiere;
    private Float moyenneGenerale;

    public Bulletin(){
        this.moyenneParMatiere = new HashMap<Matiere, Float>();
        this.moyenneGenerale = null;
    }

    public HashMap<Matiere, Float> getDictMoyenne() {
        return moyenneParMatiere;
    }

    public Float getMoyenneGenerale() {
        return moyenneGenerale;
    }

    public void setMoyenneGenerale(Float moyenneGenerale) {
        this.moyenneGenerale = moyenneGenerale;
    }

    public void setMoyenneMatiere(Matiere matiere, Float moyenne) {
        moyenneParMatiere.put(matiere, moyenne);
    }

    public void removeMoyenneMatiere(Matiere matiere) {
        moyenneParMatiere.remove(matiere);
    }
    
}
