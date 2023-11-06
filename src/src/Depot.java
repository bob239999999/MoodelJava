import java.util.Date;

public class Depot {
    private static int nextDepoId = 1;
    private int depoId;
    private String date;
    private Document doc;

    public Depot(String date, Document doc) {
        this.depoId = nextDepoId;
        nextDepoId++;
        this.date = date;
        this.doc = doc;
    }
    
    public String getDate(){
        return date;
    }
}
