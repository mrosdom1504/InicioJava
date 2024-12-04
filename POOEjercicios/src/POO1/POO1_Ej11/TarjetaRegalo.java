package POO1.POO1_Ej11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class TarjetaRegalo {
    private double saldo;
    private String tarjeta;
    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.tarjeta= crearTarjeta();
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
        return "Nº"+tarjeta +
                " saldo=" + saldo;
    }
    public String crearTarjeta() {
        StringBuilder tarjeta = new StringBuilder();
        ArrayList<StringBuilder> tarjetas = new ArrayList<>();
        Random r = new Random();
        int num;
        for (int i = 0; i < 5; i++) {
            num = r.nextInt(0,9);
            tarjeta.append(num);
        }
        if(tarjetas.contains(tarjeta)){
            crearTarjeta();
        }
        tarjetas.add(tarjeta);
        return tarjeta.toString();
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
