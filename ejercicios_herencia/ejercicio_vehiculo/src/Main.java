public class Main {
    public static void main(String[] args) {
        Vehiculo auto1 = new Auto("Martin",5,4,true, false);
        auto1.caracteristicas();
        Vehiculo camion1 = new Camion("Jorge",2,6,1200, 500);
        camion1.caracteristicas();

    }
}