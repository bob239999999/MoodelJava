import java.util.Date;

public class Depot {
    private static int nextDepoId = 1;
    private int depoId;
    private String date;
    private String desc;
    private Document doc;

    public Depot(String date, String description) {
        this.depoId = nextDepoId;
        nextDepoId++;
        this.desc = description;
        this.date = date;
        this.doc = null;
    }
    public String getDate(){
        return date;
    }
    public boolean loadDocument(Document doc){
        this.doc = doc;
        return true;
    };
}
