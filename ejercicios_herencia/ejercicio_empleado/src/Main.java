public class Main {
    public static void main(String[] args) {
        Operario operario = new Operario("Enzo Fernandez","41.311.678");
        System.out.println(operario.toString());
        System.out.println();
        operario.Datos();

        System.out.println();
        System.out.println();


        Directivo directivo = new Directivo("Julian Alvarez","Licenciado en Recursos Humanos");
        System.out.println(directivo.toString());
        System.out.println();
        directivo.Informacion();

        System.out.println();
        System.out.println();

        Oficial oficial = new Oficial("Cristian Romero","34.657.443","1665");
        System.out.println(oficial.toString());
        System.out.println();
        oficial.Datos();

        System.out.println();
        System.out.println();

        Tecnico tecnico = new Tecnico("Ivan Marcone","39.281.181","Las Heras 420");
        System.out.println(tecnico.toString());
        System.out.println();
        tecnico.Datos();
    }
}