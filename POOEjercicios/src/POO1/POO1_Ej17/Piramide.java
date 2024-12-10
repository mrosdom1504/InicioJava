package POO1.POO1_Ej17;

public class Piramide {
    private int altura;
    private static int piramidesCreadas;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    public static void setPiramidesCreadas(int piramidesCreadas) {
        Piramide.piramidesCreadas = piramidesCreadas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= (altura - i); j++) {
                builder.append(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                builder.append("*");
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}


