import java.time.LocalDate;
import java.util.List;

public class Utilisateur {
    private static int nextId = 1;
    private int id;
    private String nom;
    private String prenom;
    private AffichageBehavior affichage;
    private Planning planning;
    
    public Utilisateur(String nom, String prenom) {
        this.nom = nom; 
        this.prenom = prenom;
        this.id = nextId;
        nextId ++;
    }

    public void afficherProfil() {
        System.out.println("Ulisateur: > Id: "+id+" Nom: "+nom+" Prenom: "+prenom);
    }

    public void afficherPlanning() {
        System.out.println("Afichage Planning");
    }
    public void deposerDoc(RepertoireDepot rep, Document doc) {
        LocalDate currentDate = LocalDate.now();
        
        // Obtenir l'année, le mois et le jour sous forme de chaînes de caractères
        String year = String.valueOf(currentDate.getYear());
        String month = String.format("%02d", currentDate.getMonthValue());
        String day = String.format("%02d", currentDate.getDayOfMonth());
        
        // Concaténer les valeurs pour obtenir "yyyymmdd"
        String concatenatedDate = year + month + day;
        Depot dep = new Depot(concatenatedDate, doc);
        rep.addDepot(dep);
    }

    public void affichage() {
        System.out.println("Afichage");
    }
}