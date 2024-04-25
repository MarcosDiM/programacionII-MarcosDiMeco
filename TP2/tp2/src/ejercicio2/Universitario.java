package Ejericicio2_TP2;

public class Universitario extends Libro{
    private String materia;

    public Universitario(String titulo, String autor, int añoPublicacion, boolean prestado, String materia) {
        super(titulo, autor, añoPublicacion, prestado);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString()+" ,Universitario - materia:" + materia;
    }

}
