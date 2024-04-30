package ejercicio1;

import java.util.List;

public class Asignature{
    private int classroom;
    private String hour;
    private String name;
    private Professor professor;
    private Group group;

    public Asignature(int classroom, String hour, String name) {
        this.classroom = classroom;
        this.hour = hour;
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
