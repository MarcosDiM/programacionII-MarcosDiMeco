import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Instancias creadas por Atletas, Equipos Nacionales, Pruebas, Instalaciones y Sedes.

        Athlete athlete1 = new Athlete(43595444, "Marcos Garcia", 1.75, 20, 78.5);
        Athlete athlete2 = new Athlete(39549383, "Augusto Lopez", 1.89, 24, 72.3);
        Athlete athlete3 = new Athlete(44954325, "Matias Sanchez", 1.60, 21, 85.9);
        Athlete athlete4 = new Athlete(40583259, "Santiago Borja", 1.98, 23, 94.8);
        Athlete athlete5 = new Athlete(39057285, "Alexis Reus", 1.57, 26, 99.9);
        Athlete athlete6 = new Athlete(45938294, "Enzo Vecino", 1.66, 22, 108.3);

        NacionalTeam team1 = new NacionalTeam("Rojo y Blanco", "Argentina");
        NacionalTeam team2 = new NacionalTeam("Azul y Amarillo", "Bolivia");
        NacionalTeam team3 = new NacionalTeam("Verde y Violeta", "Chile");

        Test test1 = new Test(244, "'Carrera de 200 metros'", athlete1);
        Test test2 = new Test(240, "'Salto en largo'", athlete2);
        Test test3 = new Test(242, "'Lanzamiento de bala'", athlete3);

        Instalation instalation1 = new Instalation("Nacional", "Buenos Aires", "Monumental", "Deportivo");
        Instalation instalation2 = new Instalation("Nacional", "Cordoba", "Mario Kempes", "Deportivo");

        Campus place1 = new Campus(1, "20/06/2024", "12:00 A.M.", instalation1);
        Campus place2 = new Campus(2, "21/06/2024", "09:00 A.M.", instalation2);

        //Asignacion de cada atleta a cada lista de equipo nacional.
        team1.addAthlete(athlete3);
        team1.addAthlete(athlete2);

        team2.addAthlete(athlete1);
        team2.addAthlete(athlete4);

        team3.addAthlete(athlete6);
        team3.addAthlete(athlete5);

        //Asignacion de cada atletas a cada lista de prueba.
        test1.addCompetitor(athlete2);
        test1.addCompetitor(athlete5);
        test1.addCompetitor(athlete1);
        test1.addCompetitor(athlete4);

        test2.addCompetitor(athlete3);
        test2.addCompetitor(athlete6);
        test2.addCompetitor(athlete2);
        test2.addCompetitor(athlete1);

        test3.addCompetitor(athlete4);
        test3.addCompetitor(athlete5);
        test3.addCompetitor(athlete3);
        test3.addCompetitor(athlete6);

        //Asignacion de las pruebas a las listas de sedes
        place1.addTest(test1);
        place1.addTest(test2);
        place2.addTest(test3);

        // Ejercicio 1 = Mostrar desde un objeto Instalacion: Nombre del 3er atleta de la 2da prueba.
        Instalation instalation = place1.getWhere().get(0);
        System.out.println("Nombre del tercer atleta de la segunda prueba: \nInstalacion: " + instalation.getName() + "\nNombre: " + place1.getItDoes().get(1).getParticipates().get(2).getName());

        System.out.println("-------------------------------------------------------");

        // Ejercicio 2 = Desde un objeto Instalacion: Código de la 2da prueba.
        System.out.println("Codigo de la segunda prueba: \nInstalacion: " + instalation.getName() + "\nCodigo: " + place1.getItDoes().get(1).getCode());

        System.out.println("-------------------------------------------------------");

        // Ejercicio 3 = Mostrar desde un objeto EquipoNacional: Altura de todos los atletas.
        List<NacionalTeam> teams = new ArrayList<>();

        teams.add(team1);
        teams.add(team2);
        teams.add(team3);

        for (NacionalTeam team : teams) {
            System.out.println("Equipo: " + team.getColour());
            System.out.println();
            for (int i = 0; i < 2; i++) {
                System.out.println("Nombre del Atleta: " + team.getBelongs().get(i).getName());
                System.out.println("Altura: " + team.getBelongs().get(i).getHeight());
                System.out.println();
            }
        }

        System.out.println("-------------------------------------------------------");

        // Ejercicio 4 = Mostrar desde un objeto EquipoNacional: Peso extra de cada atleta.
        System.out.println("Peso extra de cada atleta:");
        for (NacionalTeam team : teams) {
            System.out.println();
            for (int i = 0; i < 2; i++) {
                System.out.println("Nombre del Atleta: " + team.getBelongs().get(i).getName());
                if (team.getBelongs().get(i).extraWeight(team.getBelongs().get(i).calculateIMC())) {
                    System.out.println("Tiene peso extra.");
                } else {
                    System.out.println("No tiene peso extra.");
                }
            }
        }
    }
}