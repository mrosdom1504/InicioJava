package POO2_Ej6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Perro perro = new Perro("Gustavo");
        animales.add(perro);
        Gato gato = new Gato("Pepelon");
        animales.add(gato);
        Pajaro pajaro = new Pajaro("Kiwi");
        animales.add(pajaro);

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}