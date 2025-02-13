package TablaVentaProductos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
 * - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.
 * - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.
 * - Mostrar la tabla completa de ventas.
 * - Calcular y mostrar el total de ventas por producto.
 * - Determinar qué producto tuvo el mayor total de ventas
 */
public class Tabla {
    static Scanner sc = new Scanner(System.in);
    int[][] tabla;

    public Tabla() {
        tabla = new int[2][3];
    }

    public int[][] getTabla() {
        return tabla;
    }

    public void setTabla(int[][] tabla) {
        this.tabla = tabla;
    }

    @Override
    public String toString() {
        return "Tabla{" +
                "tabla=" + Arrays.deepToString(tabla) +
                '}';
    }

    public void introducirDatos() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Dia " + (i + 1) + ": ");
                System.out.println("Producto " + (j + 1) + ": ");
                tabla[i][j] = sc.nextInt();
            }
        }
    }

    public void mayorVentas() {
        int aux = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] > aux) {
                    aux = tabla[i][j];
                }
            }
        }
        System.out.println(aux);
    }
}
