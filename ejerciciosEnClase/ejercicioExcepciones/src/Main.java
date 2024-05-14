import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, operation;

        try {
            System.out.println("Ingrese dos numeros");
            System.out.print("Numero 1: ");
            num1 = sc.nextInt();
            System.out.println("");
            System.out.print("Numero 2: ");
            num2 = sc.nextInt();System.out.println("Ingrese que operacion desea realizar: ");
            System.out.println("1 - Suma / 2 - Resta / 3 - Multiplicacion / 4 - Division");
            operation = sc.nextInt();
            calculate(num1, num2, operation);
        }catch (InputMismatchException ie){
            System.out.println("Se deben ingresar dos numeros enteros");
        }
    }
    public static void calculate(int num1, int num2, int operation){
        double results;
        switch (operation){
            case 1: results = num1 + num2;
                System.out.println("El resultado de la suma es: "+ results);
                break;
            case 2: results = num1 - num2;
                System.out.println("El resultado de la resta es: "+ results);
                break;
            case 3: results = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: "+ results);
                break;
            case 4: try {
                results = num1 / num2;
                System.out.println("El resultado de la division es: "+ results);
            } catch (ArithmeticException ae){
                System.out.println("No se puede dividir por 0");
                break;
            }
            default:

                System.out.println("No se ha ingreaso un numero asociado a una operacion");
                break;
        }
    }
}