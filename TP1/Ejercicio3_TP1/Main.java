package Ejercicio3_TP1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Libro de Texto");
        BookText libroCurso = new BookText("Laboratorio","Juan Palotes",1500,"C4");
        libroCurso.data();
        System.out.println("--------");
        System.out.println("Libro de Texto Universidad de Colombia");
        BookTextUNC libroUniversidad = new BookTextUNC("Matematicas III","Einstein",2500,"A1","Bogota");
        libroUniversidad.data();
        System.out.println("--------");
        System.out.println("Novela");
        Novel novela = new Novel("Los simuladores","Damian Szifron",2000,"Ficcion");
        novela.data();

    }
}
