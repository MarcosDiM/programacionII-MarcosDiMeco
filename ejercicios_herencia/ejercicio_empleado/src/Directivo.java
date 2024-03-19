public class Directivo extends Empleado{

    private String titulo;


    public Directivo(String nombre,String titulo){
        super(nombre);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Directivo: " + this.getNombre();
    }
    public void Informacion(){
        System.out.println("Nombre: " + this.getNombre() + "\n" +
                "Titulo: " + titulo + "\n" +
                "Empresa: McDonalds S.A");
    }
}
