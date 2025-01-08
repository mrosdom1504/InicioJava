package ExamenPractica;

public class Pago implements ReglasBasicasPago {
    private int saldo;
    private int pago;
    private final int numero = 0;

    public Pago(int saldo, int pago) {
        this.saldo = saldo;
        this.pago = pago;
    }

    public void ingresarPago(int Pago) {
        this.saldo += Pago;
    }

    public void pagar(int pago) {
        this.saldo -= pago;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public static void main(String[] args) {

    }
}
