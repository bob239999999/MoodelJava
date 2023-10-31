public class Matiere {
    String nom;
    String desc;
    float avancement;
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
    public void calculerMoyenne(){

    }
}