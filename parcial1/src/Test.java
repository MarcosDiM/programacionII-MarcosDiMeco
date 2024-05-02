import java.util.ArrayList;
import java.util.List;

public class Test {
    private int code;
    private String title;
    private List<Athlete>participates;

    public Test(int code, String title, Athlete firstAthlete) {
        this.code = code;
        this.title = title;
        this.participates = new ArrayList<>();
        this.participates.add(firstAthlete);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Athlete> getParticipates() {
        return participates;
    }

    public void setParticipates(List<Athlete> participates) {
        this.participates = participates;
    }

    public void addCompetitor(Athlete competitor) {
        this.participates.add(competitor);
    }
}
