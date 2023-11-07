import java.util.ArrayList;

public class Matiere {
    private String nom;
    private String desc;
    private float avancement;
    private Professeur prof;
    private ArrayList<RepertoireDepot> listeRepertoires;
    private ArrayList<Etudiant> listeEtudiants;
    private ArrayList<Note> listeNotes;
    private ArrayList<DocCours> listeDocsCours;

    public Matiere(String nom, String desc, Professeur prof) {
        this.nom = nom;
        this.desc = desc;
        this.avancement = 0;
        this.prof = prof;
        this.listeRepertoires = new ArrayList<RepertoireDepot>();
        this.listeEtudiants = new ArrayList<Etudiant>();
        this.listeNotes = new ArrayList<Note>();
        this.listeDocsCours = new ArrayList<DocCours>();
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Professeur getProf() {
        return this.prof;
    }

    public void setProf(Professeur p) {
        this.prof = p;
    }

    public ArrayList<RepertoireDepot> getListeRepertoires() {
        return this.listeRepertoires;
    }

    public ArrayList<Etudiant> getListeEtudiants() {
        return this.listeEtudiants;
    }

    public ArrayList<Note> getListeNotes() {
        return this.listeNotes;
    }

    public ArrayList<DocCours> getListeDocCours() {
        return this.listeDocsCours;
    }


    public float getAvancement() {
        return this.avancement;
    }

    public void setAvancement(float avancement) {
        this.avancement = avancement;
    }

    public void addRepDepot(RepertoireDepot rep) {
        this.listeRepertoires.add(rep);
    }

    public void removeRepDepot(RepertoireDepot rep) {
        this.listeRepertoires.remove(rep);
    }

    public void addEtu(Etudiant e, Object source) {
        this.listeEtudiants.add(e);
    }

    public void removeEtu(Etudiant e) {
        this.listeEtudiants.remove(e);
    }

    public void addNote(Note n) {
        this.listeNotes.add(n);
    }

    public void removeNote(Note n) {
        this.listeNotes.remove(n);
    }

    public void addDocCours(DocCours d) {
        this.listeDocsCours.add(d);
    }

    public void removeDocCours(DocCours d) {
        this.listeDocsCours.remove(d);
    }

}