public class Auto extends Vehiculo {
    private boolean descapotable;

    private boolean subirBajar;
    public Auto(String duenio, int puertas, int ruedas, boolean descapotable, boolean subirBajar) {
        super(duenio, puertas, ruedas);
        this.descapotable = descapotable;
        this.subirBajar = subirBajar;
    }

    public boolean descapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void subir(){
        if(subirBajar){
            System.out.println("Bajando techo");
            subirBajar = false;
        }
    }

    public void bajar(){
        if (!subirBajar){
            System.out.println("Subiendo techo");
            subirBajar = true;
        }
    }
    @Override
    public void caracteristicas() {
        System.out.println("Dueño: "+getDuenio());
        System.out.println("Puertas: "+getPuertas());
        System.out.println("Ruedas: "+getRuedas());
        if (descapotable()){
            System.out.println("Descapotable: "+descapotable());
        }
    }
}
