import java.util.Scanner;

public class Athlete extends Person implements Contract{
   private double height;
   private int age;
   private double weight;

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean extraWeight(double cmi) {
        return cmi > 25;
    }

    @Override
    public double calculateIMC() {
        double resultImc = weight / Math.pow(height, 2);
        return resultImc;
    }

    @Override
    public double takePulses() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar las pulsasiones del atleta:");
        double pulses = sc.nextDouble();
        return pulses;
    }
}