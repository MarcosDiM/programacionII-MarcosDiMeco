package Ejercicio1_TP1;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected float salario;
    protected boolean trabajando;

    public Empleado(String nombre, int edad, float salario, boolean trabajando) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.trabajando = trabajando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }

    public abstract void turno();
}
