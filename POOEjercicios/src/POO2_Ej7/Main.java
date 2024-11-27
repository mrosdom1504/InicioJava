package POO2_Ej7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList();
        Circulo circulo = new Circulo(21);
        figuras.add(circulo);
        Rectangulo rectangulo = new Rectangulo(21, 21);
        figuras.add(rectangulo);

        for(Figura figura : figuras) {
            figura.imprimirArea();
        }
    }
}
