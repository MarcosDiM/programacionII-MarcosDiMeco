import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        int numberRandom = (int) (Math.random() * 100);
        adivinarNumero(numberRandom);
    }
    public static void adivinarNumero(int numberRandom) {
        Scanner sc = new Scanner(System.in);
        int numberInput;
        int attempts = 0;

        System.out.println("Debe adivinar el numero al azar entre 1 y 100 en 5 intentos o menos");
        System.out.println("Ingresar un numero: ");

        while (attempts < 7) {
            try {
                System.out.print("Intento "+ (attempts+ 1)+":");
                numberInput = sc.nextInt();

                if (numberInput > numberRandom) {
                    System.out.println("El numero es menor");
                    attempts++;
                    continue;
                } else if (numberInput < numberRandom) {
                    System.out.println("El numero es mayor");
                    attempts++;
                    continue;
                } else if (numberInput == numberRandom) {
                    System.out.println("¡Adivinaste el numero en " + attempts + " intentos!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un numero, pierdes un intento:");
                attempts++; // Incrementar intentos solo en caso de excepción
                sc.next();
            }
        }

        if (attempts == 7) {
            System.out.println("¡PERDISTE! El numero era: " + numberRandom);
        }
    }
}