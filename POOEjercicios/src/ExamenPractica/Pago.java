package ExamenPractica;

public class Pago implements ReglasBasicasPago {
    private int saldo;
    private int pago;

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
}
