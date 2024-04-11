package Ejercicio1_TP1;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan",50,12000,true,"Bromatologia");
        Trabajador trabajador = new Trabajador("Rodrigo",32,5000,false,"Investigacion");


        System.out.println("Nombre: " + gerente.getNombre());
        System.out.println("Edad: " + gerente.getEdad());
        System.out.println("Salario: " + gerente.getSalario());
        gerente.turno();
        gerente.organizarActividades();
        System.out.println("----------------");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Salario: " + trabajador.getSalario());
        trabajador.turno();
        trabajador.producir();

    }
}
