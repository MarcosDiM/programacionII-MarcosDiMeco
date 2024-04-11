package Ejercicio2_TP1;

public class Rectangle extends GeometricFigure{
    private double heigth;
    private double width;

    public Rectangle(double heigth, double width) {
        this.heigth = heigth;
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return heigth * width;
    }

    @Override
    public double perimeter() {
        return 2 * (heigth+width);
    }
}
