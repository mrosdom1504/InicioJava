package Juego2048;

import java.util.Random;
import java.util.Scanner;

public class Tablero {
    static Scanner sc = new Scanner(System.in);
    int[][] tablero;
    final int fil = 4;
    final int col = 4;

    public Tablero() {
        tablero = new int[fil][col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                tablero[i][j] = 0;
            }
        }
        celdaAleatoria(tablero);
        mostrar();
        menu();
    }

    public void menu() {
        while (true) {
            System.out.println("1. Mover Arriba");
            System.out.println("2. Mover Abajo");
            System.out.println("3. Mover Izquierda");
            System.out.println("4. Mover Derecha");
            System.out.println("5. Mostrar Tablero");
            System.out.println("6. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    moverArriba(tablero);
                    break;
                case 2:
                    moverAbajo(tablero);
                    break;
                case 3:
                    moverIzquierda(tablero);
                    break;
                case 4:
                    moverDerecha(tablero);
                    break;
                case 5:
                    mostrar();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public void celdaAleatoria(int[][] tablero) {
        Random random = new Random();
        int count = 0;
        while (count < 2) {
            int x = random.nextInt(0,3);
            int y = random.nextInt(0,3);

            if (tablero[x][y] == 0) {
                tablero[x][y] = 2;
                count++;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(tablero[i][j] + "");
            }
            System.out.println();
        }
    }
    public void moverArriba(int[][] tablero){
        boolean[][] fusionado = new boolean[fil][col];
        for (int j = 0; j < col; j++) { // Recorremos por columnas
            for (int i = 1; i < fil; i++) { // Empezamos desde la segunda fila (no la primera)
                if (tablero[i][j] != 0) { // Solo mover si la celda tiene un número
                    int k = i;
                    while (k > 0 && tablero[k - 1][j] == 0) { // Mover mientras haya espacio
                        tablero[k - 1][j] = tablero[k][j];
                        tablero[k][j] = 0;
                        k--;
                    }
                    // Si se puede fusionar con la celda superior
                    if (k > 0 && tablero[k - 1][j] == tablero[k][j] && !fusionado[k - 1][j]) {
                        tablero[k - 1][j] *= 2; // Fusionar
                        tablero[k][j] = 0;
                        fusionado[k - 1][j] = true; // Marcar como fusionada
                    }
                }
            }
        }
        celdaAleatoria(tablero);
    }
    public void moverAbajo(int[][] tablero){
        boolean[][] fusionado = new boolean[fil][col]; // Evitar dobles fusiones
        for (int j = 0; j < col; j++) { // Recorremos por columnas
            for (int i = fil - 2; i >= 0; i--) { // Desde la penúltima fila hacia arriba
                if (tablero[i][j] != 0) { // Solo mover si la celda tiene un número
                    int k = i;
                    while (k < fil - 1 && tablero[k + 1][j] == 0) { // Mover mientras haya espacio
                        tablero[k + 1][j] = tablero[k][j];
                        tablero[k][j] = 0;
                        k++;
                    }
                    // Si se puede fusionar con la celda inferior
                    if (k < fil - 1 && tablero[k + 1][j] == tablero[k][j] && !fusionado[k + 1][j]) {
                        tablero[k + 1][j] *= 2; // Fusionar
                        tablero[k][j] = 0;
                        fusionado[k + 1][j] = true; // Marcar como fusionada
                    }
                }
            }
        }
        celdaAleatoria(tablero);
    }
    public void moverIzquierda(int[][] tablero){
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (tablero[i][j] != 0) {
                    for (int k = j - 1; k >= 0; k--) {
                        tablero[i][0] = tablero[i][j];
                        tablero[i][j] = 0;
                    }
                }
            }
        }
        celdaAleatoria(tablero);
    }
    public void moverDerecha(int[][] tablero){
        for (int i = 0; i < fil; i++) {
            for (int j = col - 1; j >= 0; j--) {
                if (tablero[i][j] != 0) {
                    for (int k = j + 1; k < col; k++) {
                        tablero[i][3] = tablero[i][j];
                        tablero[i][j] = 0;
                    }
                }
            }
        }
        celdaAleatoria(tablero);
    }
}
