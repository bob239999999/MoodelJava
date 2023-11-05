import java.util.ArrayList;
import java.util.List;

public class Specialites {
    private List<Specialite> specialities;

    public Specialites() {
        specialities = new ArrayList<>();
        initializeSpecialities();
    }

    private void initializeSpecialities() {
        specialities.add(new Specialite("IDU"));
        specialities.add(new Specialite("SNI"));
        specialities.add(new Specialite("MM"));
    }

    public void addSpeciality(Specialite speciality) {
        specialities.add(speciality);
    }

    public List<Specialite> getSpecialities() {
        return specialities;
    }
}