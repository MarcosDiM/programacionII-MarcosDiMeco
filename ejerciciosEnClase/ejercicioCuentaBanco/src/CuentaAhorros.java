
public class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.cuentaActiva = actualizarEstado(saldo);
    }

    public boolean actualizarEstado(double saldo) {
        return saldo >= 10000;
    }

    public void estadoCuenta() {
        if (!cuentaActiva) {
            System.out.println("El saldo de la cuenta es menor a $10000, la cuenta ahora esta inactiva");
        }
    }

    @Override
    public void consignar(float cantidad){
        if (!cuentaActiva) {
            System.out.println("[ERROR CUENTA INACTIVA]");
        } else {
            super.consignar(cantidad);
        }
    }

    public void retirar(float cantidad) {
        if (!cuentaActiva) {
            System.out.println("[ERROR CUENTA INACTIVA]");
        } else {
            super.retirar(cantidad);
            extractoMensual();
        }
    }

    public void extractoMensual(){
        if (numeroRetiros > 4 ){
            saldo -= 1000;
            estadoCuenta();
        }
    }

   public void imprimir() {
        super.imprimir();
   }

}
