package Ejercicio1_TP1;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, int edad, float salario,Boolean trabajando, String departamento) {
        super(nombre,edad, salario,trabajando);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {

    }
    public void organizarActividades(){
        System.out.println("Organizando Actividades para el departamento de "+departamento+".");
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
