import java.util.ArrayList;

public class Planning {
    private static Planning instance;
    private ArrayList<Cours> listeCours;

    private Planning() {
        this.listeCours = new ArrayList<Cours>();
    }

    public static Planning getInstance() {
        if (instance == null) {
            instance = new Planning();
        }
        return(instance);
    }

    public void addCours(Cours cours) {
        listeCours.add(cours);
    }

    public void removeCours(Cours cours) {
        listeCours.remove(cours);
    }

    public ArrayList<Cours> getListeCours() {
        return listeCours;
    }

    public ArrayList<Cours> getCours(String date) {
        ArrayList<Cours> coursByDate = new ArrayList<>();

        for (Cours cours : listeCours) {
            if (cours.getDate().equals(date)) {
                coursByDate.add(cours);
            }
        }

        return coursByDate;
    }

    public ArrayList<Cours> getCours(String dateDebut, String dateFin) {
        ArrayList<Cours> coursByDateRange = new ArrayList<>();

        for (Cours cours : listeCours) {
            String coursDate = cours.getDate();
            if (coursDate.compareTo(dateDebut) >= 0 && coursDate.compareTo(dateFin) <= 0) {
                coursByDateRange.add(cours);
            }
        }

        return coursByDateRange;
    }
}