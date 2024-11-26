package Cuadrado;

import java.util.Arrays;
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
        return "Cuadrado{" + "lado=" + lado + '}';
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
            System.out.print("*  ");
        }
        if (lado != 1) {
            if (lado != 2)
                System.out.println();
            for (int i = 2; i < lado; i++) {
                if (i != 2)
                    System.out.println();
                for (int j = 0; j < lado; j++) {
                    if (j == 0)
                        System.out.print("* ");
                    else if (j == lado - 1)
                        System.out.print(" *");
                    else
                        System.out.print("   ");
                }
            }
            System.out.println();
            for (int k = 0; k < lado; k++) {
                System.out.print("*  ");
            }
        }
    }
    public void imprimirArray(){
        String[][] array = new String[lado][lado];
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (j == 0)
                    array[i][j] = "* ";
                else if (j == lado - 1)
                    array[i][j] = "* ";
                else if (i==0 || i==lado-1)
                    array[i][j] = "* ";
                else
                    array[i][j] = "  ";
            }
            System.out.println();
        }
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
