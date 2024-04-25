package ejercicio1;
import java.util.ArrayList;
import java.util.List;
public class TiendaMacotas extends Animal{

    private List <Animal> animales;

    public TiendaMacotas(List<Animal> animales) {
        this.animales = new ArrayList<>(animales);
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }
    
    public void addAnimal(Animal animal){
        animales.add(animal);
        System.out.println("Has añadido un animal: " + getNombre());
    }
    public void listarAnimales(){
        System.out.println("Lista animales: ");
        for (Animal animal: animales) {
            System.out.println("Animal: " + animal.getTipoAnmal() + "/ Nombre: " + animal.getNombre() + "/ Edad: " + animal.getEdad() + "/ Precio: $" + animal.getPrecio());
        }
    }

    public void alimentarAnimal(String nombre){
        boolean existenciaAnimal = false;
        for (Animal animal : animales) {
            if (nombre == animal.getNombre()){
                System.out.println(nombre + " ha sido alimentado");
                existenciaAnimal = true;
            }
        }
        if (!existenciaAnimal){
            System.out.println("El animal ingresado "+ nombre + " no se encuentra en la tienda.");
        }
    }

    public void venderAnimal(String nombre){
        boolean existenciaAnimal = false;
        for (Animal animal : animales) {
            if (nombre == animal.getNombre()){
                System.out.println("El animal "+ animal.getNombre()+ " ha sido venidido por $" + animal.getPrecio());
                animales.remove(animal);
                existenciaAnimal = true;
            }
        }
        if (!existenciaAnimal){
            System.out.println("El animal ingresado "+ nombre + " no se encuentra en la tienda.");
        }
    }
}
