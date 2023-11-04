import java.util.ArrayList;
import java.util.List;

public class Planning {
    private static Planning instance;
    private  int viewCount;
    private List<Cours> coursList = new ArrayList<>();
    public void showByMonth(Utilisateur user){}
    public void showByWeek(Utilisateur user){}
    public void showByDay(Utilisateur user){}

    public Planning() {
        viewCount = 0;
    }

    public Planning getPlanningInstance() {
        if (instance == null) {
            instance = new Planning();
        }
        return(instance);
    }

    public int getViewCount() {
        return viewCount;
    }

    public void addView() {
        viewCount = viewCount + 1;
    }

    public void  addCours(){

    }
    public void getPlannigInstance(Cours c){

    }

    public void addCours(Cours cours) {
        coursList.add(cours);
    }

    public void removeCours(Cours cours) {
        coursList.remove(cours);
    }

    public List<Cours> getCoursList() {
        return coursList;
    }

}