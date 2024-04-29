package Repaso_Arreglos;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero para la posicion "+(i+1)+": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int posicionMayor = 0;
        for (int i = 0; i < 10; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
                posicionMayor = i;
            }
        }
        System.out.println("El mayor numero ingresado es "+mayor+" y se ingreso en la posicion "+posicionMayor+1);
    }
}
