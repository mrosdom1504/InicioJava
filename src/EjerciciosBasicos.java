import java.util.Scanner;

public class EjerciciosBasicos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*ej1();
        ej2();
        ej3();
        ej4();
        ej5();
        ej6();
        ej7();*/
        doWhile();
    }

    //Ejercicio 1. Escribe un programa en el que se declaren las variables enteras x e y. Asignales
    //los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
    //el valor de cada variable, la suma, la resta, la división y la multiplicación.
    public static void ej1() {
        int x, y;
        x = 144;
        y = 999;
        System.out.println(suma(x, y));
        System.out.println(resta(x, y));
        System.out.println(div(x, y));
        System.out.println(mul(x, y));
    }

    //Ejercicio 2. Crea la variable nombre y asígnale tu nombre completo. Muestra su valor por
    //pantalla de tal forma que el resultado del programa sea el mismo que en el
    //ejercicio 1 del capítulo 1.
    public static void ej2() {
        String nombre = "Manuel Rossi Dominguez";
    }

    //Ejercicio 3. Crea las variables nombre, direccion y telefono y asígnale los valores correspondientes. Muestra los valores de esas variables por pantalla de tal forma que el resultado
    //del programa sea el mismo que en el ejercicio 2.
    public static void ej3() {
        String nombre = "Manuel", direccion = "c/Barcelona";
        int telefono = 123123123;
        System.out.println("nombre: " + nombre + " con direccion: " + direccion + " y telefono: " + telefono);
    }

    //Ejercicio 4 Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
    //convertir deberá estar almacenada en una variable.
    public static void ej4() {
        double euros;
        final double PESETAS = 166.386;
        System.out.println("Ingrese los euros: ");
        euros = pedirDouble();
        System.out.println((euros * PESETAS));
    }

    //Ejercicio 5. Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
    //convertir deberá estar almacenada en una variable.
    public static void ej5() {
        final double EUROS = 166.386;
        double pesetas;
        System.out.println("Ingrese las pesetas: ");
        pesetas = pedirDouble();
        System.out.println((pesetas / EUROS));
    }

    //Ejercicio 6. Escribe un programa que calcule el total de una factura a partir de la base
    //imponible (precio sin IVA). La base imponible estará almacenada en una
    //variable.
    public static void ej6() {
        System.out.println("Ingrese su base imponible: ");
        double baseImponible = pedirDouble();
        double restaIrpf = (baseImponible * 0.15);
        double importeFinal = (baseImponible - restaIrpf);
        System.out.println(importeFinal);
    }

    public static void ej7() {
        final double PI = 3.1416;
        System.out.println("Ingrese el radio del circulo: ");
        double radioCirculo = sc.nextDouble();
        radioCirculo = Math.pow(radioCirculo, 2);
        System.out.println("El area es: " + PI * radioCirculo);
    }

    public static void doWhile() {
        int numero = 2;
        do {
            System.out.println("Ingrese el numero: ");
            numero = sc.nextInt();
            System.out.println(numero);
        } while (numero % 2 == 0);
    }

    //Metodos que me ayudan a la hora de reutilizar el codigo
    public static int suma(int x, int y) {
        return (x + y);
    }

    public static int resta(int x, int y) {
        return (x - y);
    }

    public static double div(int x, int y) {
        return ((double) x / (double) y);
    }

    public static int mul(int x, int y) {
        return (x * y);
    }

    public static double pedirDouble() {
        return sc.nextDouble();
    }
}
