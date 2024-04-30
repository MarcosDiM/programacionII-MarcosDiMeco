package ejercicio1;

public class Student extends Person{
    public Student(int dni, String name) {
        super(dni, name);
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
