package POO1.POO1_Ej13;

import java.util.Random;

public class CuentaCorriente {
    private String numeroCuentaCorriente;
    private int saldo = 0;

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
        this.numeroCuentaCorriente=crearNumeroCuentaCorriente();
    }

    public CuentaCorriente() {
        this.numeroCuentaCorriente=crearNumeroCuentaCorriente();
    }

    public String getNumeroCuentaCorriente() {
        return numeroCuentaCorriente;
    }

    public void setNumeroCuentaCorriente(String numeroCuentaCorriente) {
        this.numeroCuentaCorriente = numeroCuentaCorriente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuentaCorriente='" + numeroCuentaCorriente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    public String crearNumeroCuentaCorriente() {
        Random random = new Random();
        StringBuilder numeroCuentaCorriente = new StringBuilder();
        for(int i=0; i<10;i++){
            numeroCuentaCorriente.append(random.nextInt(0, 10));
        }
        return numeroCuentaCorriente.toString();
    }

    public void ingreso(int saldo) {
        this.saldo += saldo;
    }

    public void cargo(int cargo) {
        this.saldo -= cargo;
    }

    public void transferencia(CuentaCorriente destino, int valor) {
        this.saldo -= valor;
        destino.ingreso(valor);
    }
}
