import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio2 {

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            double n;
            int posicion;
            String cadena;
            double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
            int largoCadena = valores.length;

            System.out.println("Contenido del array antes de modificar:");
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }

            System.out.print("\n\nIntroduce la posición del array a modificar: ");
            cadena = sc.nextLine();

            if (!verificarNumero(cadena)) {
                throw new InputMismatchException("ERROR - El valor ingresado no es un numero");
            } else {
                posicion = Integer.parseInt(cadena);
                if (posicion > largoCadena || posicion < 1){
                    throw new RuntimeException("ERROR - El valor ingresado no es una posicion de la lista");
                }
            }

            try {
                System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
                n = sc.nextDouble();

                valores[posicion] = n;

                System.out.println("\nPosición a modificar " + posicion);
                System.out.println("Nuevo valor: " + n);
                System.out.println("Contenido del array modificado:");
                for (int i = 0; i < valores.length; i++) {
                    System.out.printf("%.2f ", valores[i]);
                }
            } catch (InputMismatchException ie){
                System.out.println("ERROR - El valor ingresado no es un numero");
                ie.getMessage();
            } catch (RuntimeException re) {
                System.out.println("ERROR INESPERADO");
                re.getMessage();
            }


        }

        public static boolean verificarNumero(String valorCadena){
            boolean esNumero = true;

            for (int i = 0; i < valorCadena.length(); i++) {
                if (!Character.isDigit(valorCadena.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
}


