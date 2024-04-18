public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(10000, 5);
        cuentaAhorros.consignar(2000);
        cuentaAhorros.retirar(1500);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(5000, 5);
        cuentaCorriente.consignar(3000);
        cuentaCorriente.retirar(8000);
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();


    }
}