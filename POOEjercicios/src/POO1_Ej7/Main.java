package POO1_Ej7;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        while (true) {
            System.out.println("1.Mostrar numero de entradas disponibles");
            System.out.println("2.Vender entradas");
            System.out.println("3.Salir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Entradas.imprimirEntradas();
                    break;
                case 2:
                    Entradas.venderEntradas();
                    break;
                case 3:
                    System.out.println("Saliendo con exito...");
                    System.exit(0);
                    break;
            }
        }
    }
}
