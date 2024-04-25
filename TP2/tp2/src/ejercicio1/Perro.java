package ejercicio1;

public class Perro extends Animal {

    String raza;
    boolean vacunado;

    public Perro(String raza, boolean vacunado) {
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public Perro(String nombre, int edad, String tipoAnmal, double precio, String raza, boolean vacunado) {
        super(nombre, edad, tipoAnmal, precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Raza: " + getRaza() + "\n" + "Vacunado: " + isVacunado();
    }
}
