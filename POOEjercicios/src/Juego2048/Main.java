package Juego2048;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("1. Iniciar Partida");
        System.out.println("2. Continuar Partida");
        System.out.println("3. Salir del Juego");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                Tablero tablero = new Tablero();
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
                break;
            default:
        }
    }
}
