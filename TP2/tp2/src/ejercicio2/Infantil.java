package Ejericicio2_TP2;

public class Infantil extends Libro{
    private int edadRecomendada;

    public Infantil(String titulo, String autor, int añoPublicacion, boolean prestado, int edadRecomendada) {
        super(titulo, autor, añoPublicacion, prestado);
        this.edadRecomendada = edadRecomendada;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    @Override
    public String toString() {
        return super.toString()+ " , Infantil - EdadRecomendada: " + edadRecomendada;
    }
}
