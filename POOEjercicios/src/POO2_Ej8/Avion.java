package POO2_Ej8;

public class Avion extends Vehiculo{
    public Avion(int velocidad) {
        super(velocidad);
    }
    public void mover(){
        System.out.println("El avion se mueve por la carretera a "+ velocidad +" km/h");
    }
}
