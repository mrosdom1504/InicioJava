package POO2_Ej8;

public class Bicicleta extends Vehiculo{
    public Bicicleta(int velocidad) {
        super(velocidad);
    }
    public void mover() {
        System.out.println("La bicicleta se mueve por la carretera a "+ velocidad +" km/h");
    }
}
