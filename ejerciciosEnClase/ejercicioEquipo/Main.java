package Ejercicio_Clase_16_4;

public class Main {
    public static void main(String[] args) {

        Team boca = new Team();
        Player player1 = new Player("Edinson Cavani","Delantero central",10);
        Player player2 = new Player("Miguel Merentiel","Delantero central",16);
        boca.addPlayer(player1);
        boca.addPlayer(player2);

        System.out.println("Jugadores del equipo: ");
        for (Player player : boca) {
            System.out.println("Nombre: " + player.getNombre());
            System.out.println("Posicion: " + player.getPosicion());
            System.out.println("Numero de camiseta: " + player.getNumeroCamiseta());
            System.out.println("-------------");
        }
        boca.iterator();
    }
}
