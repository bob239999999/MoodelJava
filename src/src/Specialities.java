import java.util.ArrayList;
import java.util.List;

public class Specialities {
    private List<Speciality> specialities;

    public Specialities() {
        specialities = new ArrayList<>();
        initializeSpecialities();
    }

    private void initializeSpecialities() {
        specialities.add(new Speciality("IDU"));
        specialities.add(new Speciality("SNI"));
        specialities.add(new Speciality("MM"));
    }

    public void addSpeciality(Speciality speciality) {
        specialities.add(speciality);
    }

    public List<Speciality> getSpecialities() {
        return specialities;
    }
}