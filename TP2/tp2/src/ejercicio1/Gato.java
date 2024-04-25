package ejercicio1;

public class Gato extends Animal{

    String raza;
    boolean esterilizado;

    public Gato(String raza, boolean esterilizado) {
        this.raza = raza;
        this.esterilizado = esterilizado;
    }

    public Gato(String nombre, int edad, String tipoAnmal, double precio, String raza, boolean esterilizado) {
        super(nombre, edad, tipoAnmal, precio);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Raza: " + getRaza() + "\n" + "Esterilizado: "+ isEsterilizado();
    }
}
