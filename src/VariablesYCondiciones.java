import java.util.Arrays;
import java.util.Scanner;

public class VariablesYCondiciones {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*ej1();
        ej2();
        ej3();
        ej4();
        ej5();
        ej6();
        ej7();
        ej8();*/
        ej9();
        ej10();
    }

    //1. Pedir los coeficientes de una ecuación se 2o grado, y muestre sus soluciones reales. Si
    //no existen,debe indicarlo
    public static void ej1() {
        System.out.println("Ingrese el primer coeficiente: ");
        double coeficiente1 = pedirDouble();
        System.out.println("Ingrese el segundo coeficiente: ");
        double coeficiente2 = pedirDouble();
        if (coeficiente2 == 0) {
            System.out.println("No se puede dividir por 0");
            System.exit(0);
        }
        System.out.println(coeficiente1 / coeficiente2);
    }

    //2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
    public static void ej2() {
        double radioCirculo = pedirDouble();
        System.out.println(Math.PI * Math.pow(radioCirculo, 2));
    }

    //3. Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.
    public static void ej3() {
        double radioCircunferencia = pedirDouble();
        System.out.println(2 * Math.PI * radioCircunferencia);
    }

    //4. Pedir dos números y decir si son iguales o no.
    public static void ej4() {
        System.out.println("Ingrese el primer numero: ");
        double n1 = pedirDouble();
        System.out.println("Ingrese el segundo numero: ");
        double n2 = pedirDouble();
        if (n1 == n2)
            System.out.println("Son iguales");
        else
            System.out.println("Son distintos");
    }

    //5. Pedir un número e indicar si es positivo o negativo.
    public static void ej5() {
        System.out.println("Ingrese un numero: ");
        double numero = pedirDouble();
        if (numero >= 0)
            System.out.println("Este numero es positivo");
        else
            System.out.println("Este numero es negativo");
    }

    //6. Pedir dos números y decir si uno es múltiplo del otro.
    public static void ej6() {
        System.out.println("Ingrese el primer numero: ");
        double n1 = pedirDouble();
        System.out.println("Ingrese el segundo numero: ");
        double n2 = pedirDouble();
        if (n1 % n2 == 0)
            System.out.println("Son multiplos");
    }

    //7. Pedir dos números y decir cual es el mayor.
    public static void ej7() {
        System.out.println("Ingrese el primer numero: ");
        double n1 = pedirDouble();
        System.out.println("Ingrese el segundo numero: ");
        double n2 = pedirDouble();
        if (n1 > n2)
            System.out.println(n1 + " es mayor que " + n2);
        else
            System.out.println(n1 + " es menor que " + n2);
    }

    //8. Pedir dos números y decir cual es el mayor o si son iguales.
    public static void ej8() {
        System.out.println("Ingrese el primer numero: ");
        double n1 = pedirDouble();
        System.out.println("Ingrese el segundo numero: ");
        double n2 = pedirDouble();
        if (n1 > n2)
            System.out.println(n1 + " es mayor que " + n2);
        else if (n1 == n2)
            System.out.println("Son iguales");
        else
            System.out.println(n1 + " es menor que " + n2);
    }

    //9. Pedir dos números y mostrarlos ordenados de mayor a menor.
    public static void ej9() {
        System.out.println("Ingrese un numero: ");
        double n1 = pedirDouble();
        System.out.println("Ingrese un numero: ");
        double n2 = pedirDouble();
        double[] numeros = {n1, n2};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    //10. Pedir tres números y mostrarlos ordenados de mayor a menor.
    public static void ej10() {
        System.out.println("Ingrese un numero: ");
        double n1 = pedirDouble();
        System.out.println("Ingrese un numero: ");
        double n2 = pedirDouble();
        System.out.println("Ingrese un numero: ");
        double n3 = pedirDouble();
        double[] numeros = {n1, n2, n3};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    public static double pedirDouble() {
        return sc.nextDouble();
    }
}
