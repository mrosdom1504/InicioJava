package POOAprendizaje.Parte3;

public class Detergente implements ConDescuento {
    private String marca;
    private double precio;
    private double descuento;
    private double valorDescuento;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", valorDescuento=" + valorDescuento +
                '}';
    }
}
