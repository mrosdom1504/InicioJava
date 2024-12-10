package POO1.POO1_Ej17;

public class Rectangulo {
    private int lado;
    private int altura;
    private static int rectangulosCreados;

    public Rectangulo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
        rectangulosCreados++;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    public static void setRectangulosCreados(int rectangulosCreados) {
        Rectangulo.rectangulosCreados = rectangulosCreados;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < lado; j++) {
                builder.append("*");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
