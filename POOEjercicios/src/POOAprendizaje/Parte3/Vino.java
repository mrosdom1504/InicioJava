package POOAprendizaje.Parte3;

import java.time.LocalDate;

public class Vino implements EsLiquido, ConDescuento, EsAlimento {
    private String marca;
    private String tipo;
    private double gradoDeAlcohol;
    private double precio;
    private LocalDate caducidad;
    private int calorias;
    private double descuento;
    private double valorDescuento;
    private double volumen;
    private String tipoEnvase;

    public Vino(String marca, String tipo, double gradoDeAlcohol, double precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.gradoDeAlcohol = gradoDeAlcohol;
        this.precio = precio;
        normalizarCalorias();
    }


    public void setVolumen(double v) {
        this.volumen = v;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setDescuento(double des) {
        this.descuento = des;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecioDescuento() {
        return valorDescuento;
    }

    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public int getCalorias() {
        return calorias;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getGradoDeAlcohol() {
        return gradoDeAlcohol;
    }

    public void setGradoDeAlcohol(double gradoDeAlcohol) {
        this.gradoDeAlcohol = gradoDeAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void normalizarCalorias() {
        this.calorias = (int)(gradoDeAlcohol * 10);
    }

    @Override
    public String toString() {
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", gradoDeAlcohol=" + gradoDeAlcohol +
                ", precio=" + precio +
                ", caducidad=" + caducidad +
                ", calorias=" + calorias +
                ", descuento=" + descuento +
                ", valorDescuento=" + valorDescuento +
                ", volumen=" + volumen +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                '}';
    }
}
