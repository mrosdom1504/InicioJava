package POO1.POO1_Ej9;

import POO1.POO1_Ej8.Terminal;

public class Movil extends Terminal{
    private String tarifa;
    private double dinero = 0;
    public Movil(String numero,String tarifa){
        super(numero);
        this.tarifa = tarifa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero += dinero;
    }

    @Override
    public String toString() {
        return "Nº" + numero + " Tiempo: " + tiempo + " -tarificados "+dinero+" euros";
    }

    public void llama(Movil telefono, int tiempo) {
        this.tiempo += tiempo;
        this.dinero = (((double) tiempo /60)*0.12);
        telefono.setTiempo(tiempo);
    }
}
