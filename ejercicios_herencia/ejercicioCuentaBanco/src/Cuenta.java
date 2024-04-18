import java.sql.SQLOutput;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual = 24;
    protected float comensionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad){
        saldo += cantidad;
        numeroConsignaciones ++;
    }

    public void retirar(float cantidad){
        if (cantidad > saldo){
            System.out.println("[ERROR] Saldo insuficiente");
        } else {
            saldo -= cantidad;
            numeroRetiros ++;
        }
    }
    public void calcularInteres(){
        float interesMensual = saldo * ((tasaAnual/12)/100);
        saldo += interesMensual;
    }

    public void extractoMensual(){
        comensionMensual = saldo/100;
        saldo -= comensionMensual;
        calcularInteres();
    }

    public void imprimir(){
        System.out.println("SALDO: "+ saldo);
        System.out.println("CONSIGNACIONES REALIZADAS: "+ numeroConsignaciones);
        System.out.println("CANTIDAD DE RETIROS: "+ numeroRetiros);
        System.out.println("TASA ANUAL: "+ tasaAnual + "%");
        System.out.println("Comision mensual: "+ comensionMensual);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
