package Ejericicio2_TP2;

public class Libro implements Prestable{
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;
    protected boolean prestado;

    public Libro(String titulo, String autor, int añoPublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + añoPublicacion + ", Estado: " + (prestado ? "Prestado" : "Disponible");
    }
}
