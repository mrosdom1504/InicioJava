package POO2_Ej7;

public class Circulo extends Figura{
    private double radius;
    public Circulo(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calcularArea(){
        return Math.PI * radius * radius;
    }
    public void imprimirArea(){
        System.out.println("Circulo: " + calcularArea());
    }
}
