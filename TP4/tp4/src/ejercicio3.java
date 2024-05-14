import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[]args){
        calcularAreaTriangulo();
    }

    public static void calcularAreaTriangulo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA DE AREA DE TRIANGULO");


        try{
            System.out.print("Ingrese la base del triangulo en cm: ");
            float base = sc.nextFloat();
            System.out.print("Ingrese la altura del triangulo en cm: ");
            float altura = sc.nextFloat();

            float resultado = (base*altura) / 2;

            System.out.println("EL AREA DEL TRIANGULO ES DE :"+ resultado + "cm²");
        } catch (InputMismatchException ie){
            System.out.println("ERROR - El valor ingresado no es un numero");
            ie.getMessage();
        }
    }

}
