package Clases;

import Interfaces.Dibujable;
import Interfaces.Figura;
import Interfaces.Rotable;

public class Cuadrado implements Figura, Rotable, Dibujable {
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado*lado;
    }

    public void rotar() {
        System.out.println("Se ha rotado el cuadrado");
    }
    public void dibujar() {
        System.out.println("Se ha dibujado un cuadrado");
    }
}
