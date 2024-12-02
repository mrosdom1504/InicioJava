package POO2.POO2_Ej8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Coche coche = new Coche(12);
        vehiculos.add(coche);
        Bicicleta bicicleta = new Bicicleta(123);
        vehiculos.add(bicicleta);
        Avion avion = new Avion(12321);
        vehiculos.add(avion);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
        }
    }
}
