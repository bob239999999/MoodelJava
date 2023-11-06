import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepertoireDepot {
    private String titre;
    private String desc;
    private boolean ouvert;
    private String limiteRendu;
    private List<Depot> depotList;

    public RepertoireDepot(String titre, String desc, String dateLimite) {
        this.titre = titre;
        this.desc = desc;
        this.limiteRendu = dateLimite;
        this.depotList = new ArrayList<>();
    }

    public boolean addDepot(Depot depot) {
        String dateDepot = depot.getDate();
        if (dateDepot.compareTo(this.limiteRendu) > 0){
            System.out.println("La date limite de rendu est dépassée.");
            return false;
        } else {
            System.out.println("Travail rendu.");
            this.depotList.add(depot);
            return true;
        }

    }

    public void removeDepot(Depot dep) {
        depotList.remove(dep);
    }

    public List<Depot> getDepotList() {
        return depotList;
    }

    public Depot getDepot(Depot depotToFind) {
        for (Depot depot : depotList) {
            if (depot == depotToFind) {
                return depot;
            }
        }
        return null;
    }


}
