package Ejercicio_Clase_16_4;

public class Player {
    private String nombre;
    private String posicion;
    private int numeroCamiseta;

    public Player(String nombre, String posicion, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

}
