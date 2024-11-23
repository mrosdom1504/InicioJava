import java.util.*;

public class Matrices {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //ej1();
        //ej2();
        ej3();
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
    //Suma dos matrices
    public static void ej3() {
        int[][] numeros = new int[2][2];
        numeros[0][0]=23;
        numeros[0][1]=456;
        numeros[1][0]=789;
        numeros[1][1]=123;
        int[][] resultado = new int[2][2];
        resultado[0][0]=123;
        resultado[0][1]=789;
        resultado[1][0]=123;
        resultado[1][1]=123;

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                numeros[i][j]+=resultado[i][j];
            }
        }
        System.out.println(Arrays.deepToString(numeros));
    }
}
