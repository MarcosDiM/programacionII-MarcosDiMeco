package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String course;
    private char letter;
    private Asignature recieves;

    private List<Student> belongs;

    public Group(String course, char letter, List<Student> belongs) {
        this.course = course;
        this.letter = letter;
        this.belongs = new ArrayList<>(belongs);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Asignature getRecieves() {
        return recieves;
    }

    public void setRecieves(Asignature recieves) {
        this.recieves = recieves;
    }

    public List<Student> getBelongs() {
        return belongs;
    }

    public void setBelongs(List<Student> belongs) {
        this.belongs = belongs;
    }
}
