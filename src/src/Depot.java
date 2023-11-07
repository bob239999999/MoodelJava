public class Depot {
    private static int nextIdDepot = 1;
    private int idDepot;
    private String date;
    private Etudiant etudiant;
    private TravailEtudiant travailEtu;
    private Correction correction;
    private Note note;
    private RepertoireDepot repDepot;

    public Depot(String date, TravailEtudiant travailEtu) {
        this.idDepot = nextIdDepot;
        nextIdDepot++;
        this.date = date;
        this.travailEtu = travailEtu;
        this.etudiant = travailEtu.getEtu();
    }

    public int getID(){
        return idDepot;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public Etudiant getEtu(){
        return this.etudiant;
    }

    public void setEtu(Etudiant e){
        this.etudiant = e;
    }

    public TravailEtudiant getTravailEtu(){
        return this.travailEtu;
    }

    public void setTravailEtu(TravailEtudiant travailEtu){
        this.travailEtu = travailEtu;
    }

    public RepertoireDepot getRepDepot(){
        return this.repDepot;
    }

    public void setRepDepot(RepertoireDepot rep){
        this.repDepot = rep;
    }

    public Correction getCorrection(){
        return this.correction;
    }

    public void setCorrection(Correction cor){
        this.correction = cor;
    }

    public Note getNote(){
        return this.note;
    }

    public void setNote(Note note){
        this.note = note;
    }

}
