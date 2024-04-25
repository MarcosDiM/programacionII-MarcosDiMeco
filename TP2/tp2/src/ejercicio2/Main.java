package Ejericicio2_TP2;

public class Main {
    public static void main(String[] args) {
         Biblioteca listaLibros = new Biblioteca();

         Novela novela1 = new Novela("Cien años de soledad","Gabriel García Márquez",1967,true,"Realismo fantastico");
         Universitario universitario1 = new Universitario("Introducción a la psicología"," Charles G. Morris, Albert A. Maisto",2013,false,"Psicologia");
         Infantil infantil1 = new Infantil("El principito","Antoine de Saint-Exupéry",1943,false,8);

         //Agredando libros a la lista
         listaLibros.agregarLibro(novela1);
         listaLibros.agregarLibro(universitario1);
         listaLibros.agregarLibro(infantil1);

         //Prestando libros
         listaLibros.prestarLibro("Harry Potter"); //Libro que no esta disponible en la biblioteca
         listaLibros.prestarLibro("El principito");

         //Devolviendo libros
         listaLibros.devolverLibro("El principito");

         //Mostrando lista de libros
         listaLibros.mostrarLibros();



    }
}
