public class Oficial extends Operario{

    private String numeroPlaca;

    public Oficial(String nombre, String dni,String numeroPlaca) {
        super(nombre, dni);
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    @Override
    public String toString() {
        return "Oficial: " + this.getNombre();
    }

    @Override
    public void Datos() {
        super.Datos();
        System.out.println("Numero de Placa: " + numeroPlaca);
    }
}