package Ejericicio2_TP2;

public class Novela extends Libro{
    private String genero;

    public Novela(String titulo, String autor, int añoPublicacion, boolean prestado, String genero) {
        super(titulo, autor, añoPublicacion, prestado);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+" ,Novela - Genero:" + genero;
    }
}
