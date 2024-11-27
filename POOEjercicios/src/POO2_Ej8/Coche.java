package POO2_Ej8;

public class Coche extends Vehiculo {
    public Coche(int velocidad) {
        super(velocidad);
    }
    public void mover() {
        System.out.println("El coche se mueve por la carretera a "+ getVelocidad() +" km/h");
    }
}
