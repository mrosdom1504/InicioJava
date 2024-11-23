package Tiempo;

import java.util.Objects;

public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        normalizarTiempo();
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return  hora +"h "+ minuto+"m "+segundo+"s";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiempo tiempo = (Tiempo) o;
        return hora == tiempo.hora && minuto == tiempo.minuto && segundo == tiempo.segundo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, minuto, segundo);
    }
    private void normalizarTiempo() {
        this.minuto += this.segundo / 60;
        this.segundo = this.segundo % 60;

        this.hora += this.minuto / 60;
        this.minuto = this.minuto % 60;
    }
    public Tiempo sumar(Tiempo tiempo,Tiempo tiempo2) {
        segundo = tiempo.segundo + tiempo2.segundo;
        minuto = tiempo.minuto + tiempo2.minuto;
        hora = tiempo.hora + tiempo2.hora;
        return new Tiempo(hora,minuto,segundo);
    }
    public Tiempo restar(Tiempo tiempo,Tiempo tiempo2) {
        segundo = tiempo.segundo - tiempo2.segundo;
        minuto = tiempo.minuto - tiempo2.minuto;
        hora = tiempo.hora - tiempo2.hora;
        return new Tiempo(hora,minuto,segundo);
    }
}
