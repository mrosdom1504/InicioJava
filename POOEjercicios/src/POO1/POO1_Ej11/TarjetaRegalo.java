package POO1.POO1_Ej11;

import java.util.ArrayList;
import java.util.Random;

public class TarjetaRegalo {
    private double saldo;
    private String tarjeta;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.tarjeta = crearTarjeta();
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Tarjeta nº" + tarjeta +
                " saldo=" + saldo +"€";
    }

    public String crearTarjeta() {
        StringBuilder tarjeta = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            tarjeta.append(r.nextInt(0,10));
        }
        return tarjeta.toString();
    }

    public void gasta(double dinero) {
        if (dinero > this.saldo) {
            System.out.println("No tiene suficiente saldo para gastar " + dinero + "€");
        } else
            this.saldo -= dinero;
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjetaRegalo) {
        double saldoNuevo = this.saldo + tarjetaRegalo.saldo;
        tarjetaRegalo.setSaldo(0);
        this.saldo = 0;
        return new TarjetaRegalo(saldoNuevo);
    }
}
