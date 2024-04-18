public class CuentaCorriente extends Cuenta{
    private float sobregiro;
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }
    @Override
    public void retirar(float cantidad){
        if (cantidad <= saldo ) {
            saldo -= cantidad;
        } else {
            sobregiro += (cantidad - saldo);
            saldo = 0;
        }
    }
    public void consignar(float cantidad) {

        if (sobregiro > 0) {
            float resto = 0;
            if (cantidad > sobregiro){
                resto = cantidad - sobregiro;
                super.consignar(resto);
                sobregiro = 0;

            } else if (cantidad <= sobregiro) {
                sobregiro -= cantidad;
                System.out.println("El dinero ingresado de: "+ cantidad +"$, fue utilidado para el sobregiro.");
                System.out.println("El sobregiro restante es de: "+ sobregiro);
            }
        } else {
            super.consignar(cantidad);
        }
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("SOBREGIRO: "+ sobregiro);
    }
}
