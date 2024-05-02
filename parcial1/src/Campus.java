import java.util.ArrayList;
import java.util.List;

public class Campus {
    private int fase;
    private String date;
    private String hour;
    private List<Test>itDoes;
    private List<Instalation>where;

    public Campus(int fase, String date, String hour, Instalation firsInstalation) {
        this.fase = fase;
        this.date = date;
        this.hour = hour;
        this.itDoes = new ArrayList<>();
        this.where = new ArrayList<>();
        this.where.add(firsInstalation);
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public List<Test> getItDoes() {
        return itDoes;
    }

    public void setItDoes(List<Test> itDoes) {
        this.itDoes = itDoes;
    }

    public List<Instalation> getWhere() {
        return where;
    }

    public void setWhere(List<Instalation> where) {
        this.where = where;
    }

    public void addTest(Test test){
        this.itDoes.add(test);
    }
    public void addInstalation(Instalation instalation){
        this.where.add(instalation);
    }
}
