import java.util.ArrayList;
import java.util.List;
public class NacionalTeam {
    private String colour;
    private String country;
    private List <Athlete> belongs;

    public NacionalTeam(String color, String country) {
        this.colour = color;
        this.country = country;
        this.belongs = new ArrayList<>();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Athlete> getBelongs() {
        return belongs;
    }

    public void setBelongs(List<Athlete> belongs) {
        this.belongs = belongs;
    }

    public void addAthlete(Athlete athlete){
        this.belongs.add(athlete);
    }
}
