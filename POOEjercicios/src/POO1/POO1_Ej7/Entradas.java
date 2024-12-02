package POO1.POO1_Ej7;

import java.util.Scanner;

public class Entradas {
    static Scanner sc = new Scanner(System.in);
    private static int salaPrincipal = 1000;
    private static int compraVenta = 200;
    private static int vip = 25;

    public static int getSalaPrincipal() {
        return salaPrincipal;
    }

    public static void setSalaPrincipal(int salaPrincipal) {
        Entradas.salaPrincipal = salaPrincipal;
    }

    public static int getCompraVenta() {
        return compraVenta;
    }

    public static void setCompraVenta(int compraVenta) {
        Entradas.compraVenta = compraVenta;
    }

    public static int getVip() {
        return vip;
    }

    public static void setVip(int vip) {
        Entradas.vip = vip;
    }

    public static void imprimirEntradas() {
        System.out.println("Sala Principal: " + salaPrincipal);
        System.out.println("Compra Venta: " + compraVenta);
        System.out.println("Vip: " + vip);
    }
    public static void venderEntradas(){
        System.out.println("¿Que tipo de entradas desea comprar?");
        System.out.println("[1] Sala Principal = "+salaPrincipal);
        System.out.println("[2] Compra Venta = "+compraVenta);
        System.out.println("[3] Vip = "+vip);
        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                System.out.println("¿Cuantas entradas desea comprar?");
                int entrada = sc.nextInt();
                if(entrada > salaPrincipal){
                    System.out.println("Has pedido más entradas de las disponibles");
                }else {
                    System.out.println("Entradas compradas con exito");
                    salaPrincipal -= entrada;
                    System.out.println(salaPrincipal+" entradas disponibles");
                }
                break;
            case 2:
                System.out.println("¿Cuantas entradas desea comprar?");
                entrada = sc.nextInt();
                if(entrada > compraVenta){
                    System.out.println("Has pedido más entradas de las disponibles");
                }else {
                    System.out.println("Entradas compradas con exito");
                    compraVenta -= entrada;
                    System.out.println(compraVenta+" entradas disponibles");
                }
                break;
            case 3:
                System.out.println("¿Cuantas entradas desea comprar?");
                entrada = sc.nextInt();
                if(entrada > vip){
                    System.out.println("Has pedido más entradas de las disponibles");
                }else {
                    System.out.println("Entradas compradas con exito");
                    vip -= entrada;
                    System.out.println(vip+" entradas disponibles");
                }
                break;
        }
    }
}
