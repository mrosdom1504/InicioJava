package Cuadrado;

import java.util.Objects;

public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuadrado cuadrado = (Cuadrado) o;
        return lado == cuadrado.lado;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lado);
    }

    public void imprimir() {
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 2; j < lado; j++) {
            if (j != 2)
                System.out.println();
            for (int l = 0; l < lado; l++) {
                if (l == 0)
                    System.out.print("*");
                else if (l == lado - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
        System.out.println();
        for (int k = 0; k < lado; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
