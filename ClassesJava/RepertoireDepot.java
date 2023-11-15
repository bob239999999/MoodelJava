import java.util.ArrayList;

public class RepertoireDepot {
    private Matiere matiere;
    private String titre;
    private String desc;
    private boolean ouvert;
    private String limiteRendu;
    private ArrayList<Depot> listeDepots;

    public RepertoireDepot(Matiere mat, String titre, String desc, String dateLimite) {
        this.matiere = mat;
        this.titre = titre;
        this.desc = desc;
        this.ouvert = true;
        this.limiteRendu = dateLimite;
        this.listeDepots = new ArrayList<Depot>();
    }

    public Matiere getMatiere(){
        return this.matiere;
    }

    public void setMatiere(Matiere m){
        this.matiere = m;
    }

    public String getTitre(){
        return this.titre;
    }

    public void setTitre(String t){
        this.titre = t;
    }

    
    public String getDesc(){
        return this.desc;
    }

    public void setDesc(String t){
        this.desc = t;
    }


    public boolean getOuvert(){
        return this.ouvert;
    }

    public void setOuvert(boolean b){
        this.ouvert = b;
    }

    public String getLimiteRendu(){
        return this.limiteRendu;
    }

    public void setLimiteRendu(String limite){
        this.limiteRendu = limite;
    }

    public ArrayList<Depot> getListeDepots() {
        return this.listeDepots;
    }

    public Depot getDepot(Depot depotToFind) {
        for (Depot depot : this.listeDepots) {
            if (depot == depotToFind) {
                return depot;
            }
        }
        return null;
    }

    public boolean addDepot(Depot depot) {
        String dateDepot = depot.getDate();
        if (dateDepot.compareTo(this.limiteRendu) > 0){
            System.out.println("La date limite de rendu est dépassée.");
            return false;
        } else {
            System.out.println("Travail rendu.");
            this.listeDepots.add(depot);
            return true;
        }

    }

    public void removeDepot(Depot dep) {
        this.listeDepots.remove(dep);
    }



}
