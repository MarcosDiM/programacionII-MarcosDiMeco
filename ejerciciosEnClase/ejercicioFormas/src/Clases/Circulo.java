package Clases;

import Interfaces.Dibujable;
import Interfaces.Figura;

public class Circulo implements Figura, Dibujable {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }


    @Override
    public float area() {
        return (float) (3.14*radio*radio);
    }

    public void dibujar() {
        System.out.println("Se ha dibujado un circulo");
    }

}
