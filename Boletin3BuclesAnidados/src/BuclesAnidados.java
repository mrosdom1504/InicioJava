import java.util.Scanner;

public class BuclesAnidados {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //ej1();
        //ej2();
        //ej3();
        ej4();
    }
    //Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
    public static void ej1() {
        for (int i = 1; i <= 10; i++) {
            if (i!=1) {
                System.out.println();
            }
            for (int j = 0; j <= 10; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
    //Dibuja un cuadrado de n elementos de lado utilizando *.
    public static void ej2() {
        System.out.println("Ingrese la altura del cuadrado");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            System.out.println();
            for (int j = 0; altura > j; j++) {
                System.out.print("*");
            }
        }
    }
    //Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X),
    //que muestre los números del 0-0-0-0-0 al 9-9-9-9-9,
    //con la particularidad de que cada vez que aparezca un 3,
    //se sustituya por una E.
    public static void ej3() {
        int contador = 0;
        while (contador <= 10) {
            if (contador!=3) {
                System.out.println(contador+"-"+contador+"-"+contador+"-"+contador+"-"+contador);
            }else
                System.out.println("E-E-E-E-E");
            contador++;
        }
    }
    //Realizar un programa que nos pida un número n
    //y nos diga cuántos números hay entre 1 y n que son primos.
    public static void ej4() {
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            if(esPrimo(i))
                System.out.println(i);
        }
    }
    public static boolean esPrimo(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
