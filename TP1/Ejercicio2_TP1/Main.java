package Ejercicio2_TP1;

public class Main {
    public static void main(String[] args) {
        Circle circulo = new Circle(3.0);
        Rectangle rectangulo = new Rectangle(8.0, 10.0);

        System.out.println("El perimetro del circulo es: " + circulo.perimeter());
        System.out.println("El area del circulo es: " + circulo.area());
        System.out.println("---------");
        System.out.println("El perimetro del rectangulo es: " + rectangulo.perimeter());
        System.out.println("El area del rectangulo es: " + rectangulo.area());


    }
}
