import java.util.Date;

public class Cours {
    private Matiere matiere;
    private String date;
    private String heure;

    public Cours(String date, String heure, Matiere matiere) {
        this.date = date;
        this.heure = heure;
        this.matiere = matiere;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }


}