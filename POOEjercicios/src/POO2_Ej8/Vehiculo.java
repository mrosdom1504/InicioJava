package POO2_Ej8;

public abstract class Vehiculo {
    protected int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    abstract void mover();
}
