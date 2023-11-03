public class Planning {
    Planning instance;
    int viewCount;
    public void showByMonth(Utilisateur user){}
    public void showByWeek(Utilisateur user){}
    public void showByDay(Utilisateur user){}

    private Planning() {
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
    public void removeCours(Cours c){

    }
}
