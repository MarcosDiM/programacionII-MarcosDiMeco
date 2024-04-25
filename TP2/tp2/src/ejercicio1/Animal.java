package ejercicio1;

public class Animal {
    String nombre;
    int edad;
    String tipoAnmal;
    double precio;

    public Animal() {
    }

    public Animal(String nombre, int edad, String tipoAnmal, double precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnmal = tipoAnmal;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAnmal() {
        return tipoAnmal;
    }

    public void setTipoAnmal(String tipoAnmal) {
        this.tipoAnmal = tipoAnmal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void Alimentar(String nombre){
        System.out.println(nombre + " esta comiendo...");
    }

    @Override
    public String toString() {
        return  "Animal: " + tipoAnmal + "\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Precio: $" + precio;
    }
}
