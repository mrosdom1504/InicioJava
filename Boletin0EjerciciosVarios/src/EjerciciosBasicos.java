import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
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
        ej7();
        doWhile();
        numRandom();
        rockPaperScissors();
        arrays();
        banderaRandom();
        arraysBidimensionales();*/
        busquedaDelTesoro();
        //forEach();
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
    //Calcular radio de un circulo con clases
    public static void ej7() {
        final double PI = 3.1416;
        System.out.println("Ingrese el radio del circulo: ");
        double radioCirculo = sc.nextDouble();
        radioCirculo = Math.pow(radioCirculo, 2);
        System.out.println("El area es: " + PI * radioCirculo);
    }
    //Usar do while para ingresar un numero mientras sea par
    public static void doWhile() {
        int numero = 2;
        do {
            System.out.println("Ingrese el numero: ");
            numero = sc.nextInt();
            System.out.println(numero);
        } while (numero % 2 == 0);
    }
    //Generador de numeros aleatorios entre 50 y 60
    public static void numRandom() {
        for (int i = 0; i <= 20; i++) {
            System.out.println((int) ((Math.random() * 10)+50));
        }
    }
    //Piedra, papel, tijeras aleatorio con clase random
    public static void rockPaperScissors() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                System.out.println("ROCK");
                break;
            case 1:
                System.out.println("PAPER");
                break;
            case 2:
                System.out.println("SCISSORS");
                break;
        }
    }
    //Crear un array de longitud 3 e imprimirlo por pantalla
    public static void arrays(){
        int[] numero = new int[3];
        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;
        System.out.println(Arrays.toString(numero));
    }
    //Crear una bandera de N franjas de colores aleatorios
    public static void banderaRandom(){
        Random random = new Random();
        String[] colores = {"rojo","verde","azul","amarillo","morado","rosa"};
        System.out.println("¿De cuantos colores quiere la bandera?");
        int condicion = sc.nextInt();
        while(0<condicion){
            condicion--;
            switch (random.nextInt(6)){
                case 0:
                    System.out.println("-----------");
                    System.out.println("rojo");
                    break;
                case 1:
                    System.out.println("-----------");
                    System.out.println("verde");
                    break;
                case 2:
                    System.out.println("-----------");
                    System.out.println("azul");
                    break;
                case 3:
                    System.out.println("-----------");
                    System.out.println("amarillo");
                    break;
                case 4:
                    System.out.println("-----------");
                    System.out.println("morado");
                    break;
                case 5:
                    System.out.println("-----------");
                    System.out.println("rosa");
                    break;
            }
        }
        System.out.println("-----------");
    }
    //Crear array de dos dimensiones e imprimirlo
    public static void arraysBidimensionales(){
        int[][] numeros = new int[3][2];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 3;
        numeros[1][1] = 4;
        numeros[2][0] = 5;
        numeros[2][1] = 6;
        for(int[] numero : numeros){
            for(int num : numero){
                System.out.println(num);
            }
            System.out.println(Arrays.toString(numero));
        }
    }
    //Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de 4 filas por 5 columnas.
    //El usuario intentará averiguar donde está el tesoro.
    public static void busquedaDelTesoro(){
        Random random = new Random();
        boolean siNoSePisaMina = true;
        int[][] numeros = new int[4][5];
        int[][] tesoros = new int[4][5];
        System.out.println("¿Cuantas casillas de tesoro desea?: ");
        int casillas = sc.nextInt();
        while(0<casillas){
            casillas--;
            numeros[random.nextInt(0,4)][random.nextInt(0,5)] = 1;
            tesoros = numeros;
        }
        System.out.println("¿Cuantas casillas de minas desea?:");
        int minas = sc.nextInt();
        while(0<minas){
            minas--;
            int j = random.nextInt(0,4)+1;
            int aux = j;
            int k = random.nextInt(0,5)+1;
            int aux2 = k;
            for(;j>aux-1;aux++){
                for(;k>aux2-1;aux2++){
                    if(tesoros[j-1][k-1] != 1)
                        numeros[j - 1][k - 1] = 2;
                }
            }
        }
        for(int i = 0;i<numeros.length;i++){
            System.out.println();
            for(int j = 0;j<numeros[i].length;j++){
                System.out.print(numeros[i][j]);
            }
        }
        System.out.println();
        System.out.println();
        while(siNoSePisaMina) {
            System.out.println("En que fila esta el tesoro?");
            int fila = sc.nextInt();
            System.out.println("En que columna esta el tesoro?");
            int columna = sc.nextInt();
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    if (numeros[fila - 1][columna - 1] == 1) {
                        System.out.println("Encontraste el tesoro");
                        siNoSePisaMina = false;
                        break;
                    }else if (numeros[fila - 1][columna - 1] == 2) {
                        System.out.println("Pisaste una mina");
                        siNoSePisaMina = false;
                        break;
                    }else {
                        System.out.println("No hay nada");
                        break;
                    }
                }
            }
            for(int i = 0;i<numeros.length;i++){
                System.out.println();
                for(int j = 0;j<numeros[i].length;j++){
                    System.out.print(numeros[i][j]);
                }
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void forEach(){
        String[] nombre = {"Pepe","sad","asd"};
        for (int i = 0; i < nombre.length; i++) {
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre: ");
        }
        System.out.println(Arrays.toString(nombre));
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
