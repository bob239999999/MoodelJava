public class Cours {
    private String date;
    private String heure;
    private Matiere matiere;
    private Professor prof;

    public Cours(String date, String heure, Matiere matiere, Professor prof) {
        this.date = date;
        this.heure = heure;
        this.matiere = matiere;
        this.prof = prof;
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

    public Professor getProf() {
        return this.prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }
}