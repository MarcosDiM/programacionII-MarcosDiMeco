public class Tecnico extends Operario{
    private String domicilio;

    public Tecnico(String nombre, String dni,String domicilio) {
        super(nombre, dni);
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Tecnico: " + this.getNombre();
    }

    @Override
    public void Datos() {
        super.Datos();
        System.out.println("Domicilio: " + domicilio);
    }
}