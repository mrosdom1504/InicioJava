package POOAprendizaje.Parte2;

public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super(marca,potencia);
        this.aguaCaliente = false;
    }
    public Lavadora(String marca, double precio,double potencia, boolean aguaCaliente) {
        super(marca,potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }
    public double getConsumo(int horas){
        if(aguaCaliente){
            return this.potencia+this.potencia*0.2;
        }
        else{
            return horas * this.potencia;
        }
    }

    public double getCosteConsumo(int horas,double costeHora){
        double coste = horas * costeHora;
        return coste * this.potencia;
    }
}
