package Ejercicio1_TP1;

public class Trabajador extends Empleado{
    private String area;

    public Trabajador(String nombre, int edad, float salario,Boolean trabajando, String area) {
        super(nombre, edad, salario, trabajando);
        this.area = area;
    }
    public void producir(){
        System.out.println("Trabajador en produccion para el area de "+ area+".");
    }

    @Override
    public void turno() {
        if (trabajando == true){
            System.out.println("En turno de trabajo.");
        }else {
            System.out.println("En turno de descanso.");
        }
    }
}
