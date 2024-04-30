package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private String departament;

    private List<Asignature> imparts;

    public Professor(int dni, String name, String departament, List<Asignature>imparts) {
        super(dni, name);
        this.departament = departament;
        this.imparts = imparts;
    }

    public String getDepartamento() {
        return departament;
    }

    public void setDepartamento(String departamento) {
        this.departament = departamento;
    }

    public List<Asignature> getImparts() {
        return imparts;
    }

    public void setImparts(List<Asignature> imparts) {
        this.imparts = imparts;
    }

    @Override
    public int getDni() {
        return super.getDni();
    }

    @Override
    public void setDni(int dni) {
        super.setDni(dni);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
