import java.util.Date;

public class Cours {
    Matiere matiere;
    int date;
    String heur;
    public Cours(int date, String heur, Matiere matiere){
        this.date = date;
        this.heur = heur;
        this.matiere = matiere;
    }
}
