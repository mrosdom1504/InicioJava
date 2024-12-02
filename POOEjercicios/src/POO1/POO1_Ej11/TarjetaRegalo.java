package POO1.POO1_Ej11;

public class TarjetaRegalo {
    private double saldo;
    private static int numTarjeta = 0;
    public TarjetaRegalo(double saldo) {
        numTarjeta++;
        this.saldo = saldo;
    }

    public static int getNumTarjeta() {
        return numTarjeta;
    }

    public static void setNumTarjeta(int numTarjeta) {
        TarjetaRegalo.numTarjeta = numTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "TarjetaRegalo{" +
                "saldo=" + saldo +
                '}';
    }
    public void gasta(double dinero){
        if(dinero > this.saldo){
            System.out.println("No tiene suficiente saldo para gastar "+dinero+"€");
        }else
            this.saldo -= dinero;
    }
    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjetaRegalo){
        double saldoNuevo = this.saldo;
        saldoNuevo += tarjetaRegalo.saldo;
        tarjetaRegalo.setSaldo(0);
        this.saldo = 0;
        return new TarjetaRegalo(saldoNuevo);
    }
}
