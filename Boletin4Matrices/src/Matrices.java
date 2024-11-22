import java.util.*;

public class Matrices {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //ej1();
        ej2();
    }

    //Leer 5 números y mostrarlos en el mismo orden introducido.
    public static void ej1() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int contador = 0;
        while (contador < 5) {
            contador++;
            System.out.println("Ingresa un numero: ");
            int n = sc.nextInt();
            numeros.add(n);
        }
        System.out.println(numeros);
    }
    //Leer 5 números y mostrarlos en orden inverso al introducido.
    public static void ej2() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int contador = 0;
        while (contador < 5) {
            contador++;
            System.out.println("Ingresa un numero: ");
            int n = sc.nextInt();
            numeros.add(n);
        }
        numeros.sort(Collections.reverseOrder());
        System.out.println(numeros);
    }
}
