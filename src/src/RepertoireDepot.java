import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepertoireDepot {
    private String desc;
    private boolean ouvert;
    private String limiteRendu;
    private List<Depot> depotList;

    public RepertoireDepot(String desc, String l) {
        this.desc = desc;
        this.limiteRendu = l;
        this.depotList = new ArrayList<>();
    }

    public void addDepot(Depot depot) {
        depotList.add(depot);
        limiteRendu = depot.getDate();
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
