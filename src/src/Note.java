public class Note {
    private float note;
    private Depot depot;
    private Etudiant etu;
    private Matiere matiere;

    public Note(float note, Depot dep, Etudiant e, Matiere m){
        this.note = note;
        this.depot = dep;
        this.etu = e;
        this.matiere = m;
    }


    public float getNote(){
        return this.note;
    }

    public void setNote(float note){
        this.note = note;
    }

    public Depot getDepot(){
        return this.depot;
    }

    public void setDepot(Depot depot){
        this.depot = depot;
    }

    
    public Etudiant getEtudiant(){
        return this.etu;
    }

    public void setEtudiant(Etudiant e){
        this.etu = e;
    }

    public Matiere getMatiere(){
        return this.matiere;
    }

    public void setMatiere(Matiere m){
        this.matiere = m;
    }
    
}
