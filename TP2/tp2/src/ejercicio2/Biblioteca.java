package Ejericicio2_TP2;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
        System.out.println("Libro -"+libro.getTitulo()+"- agregado con exito");
    }

    public void mostrarLibros() {
        System.out.println("Lista de libros:");
        for (Libro libro: libros) {
            System.out.println(libro.getTitulo() + " por " + libro.getAutor());
        }
    }
    public void prestarLibro(String titulo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                libros.get(i).setPrestado(true);
                System.out.println("Has pedido prestado el libro: " + titulo);
                return;
            }
        }
        System.out.println("El libro -" + titulo + "- no está disponible en la biblioteca.");
    }
    public void devolverLibro(String titulo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                libros.get(i).setPrestado(false);
                System.out.println("Has devuelto  el libro: " + titulo);
                return;
            }
        }
    }
}
