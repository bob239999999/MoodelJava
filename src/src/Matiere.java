import java.util.ArrayList;
import java.util.Date;

public class Matiere {
    String nom;
    String desc;
    float avancement;
    ArrayList<RepertoireDepot> repertoires;

    public Matiere(String nom, String desc) {
        this.nom = nom;
        this.desc = desc;
        avancement = 0;
    }

    public String avancement() {
        return desc;
    }
    public String addDoc(Document doc) {
        return("added");
    }
    public String removeDoc(Document doc) {
        return("removed");
    }
    public void setAvancement(float avancement) {
        this.avancement = avancement;
    }

    public RepertoireDepot createRepertoire(String description, Date limite) {
        RepertoireDepot rep = new RepertoireDepot(description, limite);
        this.repertoires.add(rep);
        return(rep);
    }

    public void calculerMoyenne(){

    }
}