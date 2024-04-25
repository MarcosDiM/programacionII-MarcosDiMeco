package ejercicio1;

public class Pez extends Animal{
    String especie;
    String color;

    public Pez(String especie, String color) {
        this.especie = especie;
        this.color = color;
    }

    public Pez(String nombre, int edad, String tipoAnmal, double precio, String especie, String color) {
        super(nombre, edad, tipoAnmal, precio);
        this.especie = especie;
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Especie: " + getEspecie() + "\n" + "Color: " + getColor();
    }
}
