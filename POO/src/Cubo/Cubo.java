package Cubo;

import java.util.Objects;

public class Cubo {
    private int capacidad;
    private int contenido;

    public Cubo(int capacidad, int contenido) {
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "capacidad=" + capacidad +
                ", contenido=" + contenido +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cubo cubo = (Cubo) o;
        return capacidad == cubo.capacidad && contenido == cubo.contenido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacidad, contenido);
    }
    //Metodos de la clase
    public void lleno() {
        this.contenido = this.capacidad;
    }

    public void vacio() {
        this.contenido = 0;
    }

    public void pinta() {
        System.out.println("_______");
        System.out.println("|");
    }

    public void vuelcaEn(Cubo destino){
        int libres = destino.getCapacidad() - destino.getContenido();

        if(libres>0){
            destino.setContenido(destino.getContenido()+ this.contenido);
        }
    }
}
