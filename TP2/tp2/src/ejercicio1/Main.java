package ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Animal> listaAnimales = new ArrayList<>() ;
        Perro perro1 = new Perro("Choco",11, "Perro", 133000, "Collie", true);
        Perro perro2 = new Perro("Tobi",5, "Perro", 1000, "Caniche toy", true);
        Gato gato1 = new Gato("Michi",4, "Gato", 2, "Michino", true);

        System.out.println(perro1.toString());

        listaAnimales.add(perro1);
        listaAnimales.add(perro2);
        listaAnimales.add(gato1);

        System.out.println("-------------");

        TiendaMacotas tienda = new TiendaMacotas(listaAnimales);

        tienda.listarAnimales();

        System.out.println("-------------");

        tienda.alimentarAnimal("Choco");

        tienda.alimentarAnimal("Pepe");

        System.out.println("-------------");

        tienda.venderAnimal("Tobi");

        System.out.println("-------------");

        tienda.listarAnimales();

    }
}