import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant extends Utilisateur implements Observer {
    private ArrayList<TravailEtudiant> listeTravauxEtu;
    private ArrayList<Depot> listeDepots;
    private ArrayList<Matiere> listeMatieres;
    private ArrayList<Note> listeNotes;
    private Bulletin bulletin;

    public Etudiant(String nom, String prenom){
        super(nom,prenom);
        this.listeTravauxEtu = new ArrayList<TravailEtudiant>();
        this.listeDepots = new ArrayList<Depot>();
        this.listeMatieres = new ArrayList<Matiere>();
        this.listeNotes = new ArrayList<Note>();
        this.bulletin = new Bulletin();

    }

    public ArrayList<TravailEtudiant> getListeTravauxEtu() {
        return listeTravauxEtu;
    }

    public ArrayList<Depot> getListeDepots() {
        return listeDepots;
    }

    public ArrayList<Matiere> getListeMatieres() {
        return listeMatieres;
    }

    public ArrayList<Note> getListeNotes() {
        return listeNotes;
    }

    // Getter pour bulletin
    public Bulletin getBulletin() {
        return bulletin;
    }

    public void createTravailEtu(String contenu){
        TravailEtudiant travail = new TravailEtudiant(this, contenu);
        this.listeTravauxEtu.add(travail);
    }

    public void deposerTravailEtu(RepertoireDepot rep, TravailEtudiant travailEtu) {
        LocalDate currentDate = LocalDate.now();
        
        // Obtenir l'année, le mois et le jour sous forme de chaînes de caractères
        String year = String.valueOf(currentDate.getYear());
        String month = String.format("%02d", currentDate.getMonthValue());
        String day = String.format("%02d", currentDate.getDayOfMonth());
        
        // Concaténer les valeurs pour obtenir "yyyymmdd"
        String concatenatedDate = year + month + day;
        Depot dep = new Depot(concatenatedDate, travailEtu);
        rep.addDepot(dep);
    }

    @Override
    public void updateNewRep(){
    	System.out.println("Je suis "+ this.getNom()+" "+ this.getPrenom() +" notification reçue : un nouveau repertoire a été ouvert.");
    }
    
    @Override
    public void updateNewDoc(){
    	System.out.println(" Je suis "+ this.getNom()+" "+ this.getPrenom() +" notification reçue : un document vient d'être ajouté .");
    }

}