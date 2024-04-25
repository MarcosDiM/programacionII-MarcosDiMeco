package ejercicio1;

public class Ave extends Animal{

    String esprecie;
    boolean habla;

    public Ave(String esprecie, boolean habla) {
        this.esprecie = esprecie;
        this.habla = habla;
    }

    public Ave(String nombre, int edad, String tipoAnmal, double precio, String esprecie, boolean habla) {
        super(nombre, edad, tipoAnmal, precio);
        this.esprecie = esprecie;
        this.habla = habla;
    }

    public String getEsprecie() {
        return esprecie;
    }

    public void setEsprecie(String esprecie) {
        this.esprecie = esprecie;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Especie: " + getEsprecie() + "\n" + "Habla: " + isHabla();
    }
}
