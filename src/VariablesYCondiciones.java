import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;

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
        ej8();
        ej9();
        ej10();
        ej11();
        ej12();
        ej13();
        ej14();
        ej15();
        ej16();*/
        ej17();
        //true,false,false,true,false,true,false
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
        int n1 = pedirInt();
        System.out.println("Ingrese un numero: ");
        int n2 = pedirInt();
        int[] numeros = {n1, n2};
        Arrays.sort(numeros);
        System.out.println(numeros[1]+">"+numeros[0]);
    }

    //10. Pedir tres números y mostrarlos ordenados de mayor a menor.
    public static void ej10() {
        System.out.println("Ingrese un numero: ");
        int n1 = pedirInt();
        System.out.println("Ingrese un numero: ");
        int n2 = pedirInt();
        System.out.println("Ingrese un numero: ");
        int n3 = pedirInt();
        int[] numeros = {n1, n2, n3};
        Arrays.sort(numeros);
        System.out.println(numeros[2]+">"+numeros[1]+">"+numeros[0]);
    }
    //11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
    public static void ej11(){
        int contador = 0;
        System.out.println("Ingrese un numero del 0 al 9.999: ");
        char[] numeroElegido = sc.nextLine().toCharArray();
        for(char cifra: numeroElegido){
            contador += 1;
        }
        System.out.println("Este numero tiene "+contador+" cifras");


    }
    //12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
    public static void ej12(){
        String numeroAlReves ="";
        System.out.println("Ingrese un numero entre 0 y 9.999: ");
        char[] numero = sc.nextLine().toCharArray();
        for(int i = numero.length-1; i>=0;i--){
            numeroAlReves += numero[i];
        }
        System.out.println(numeroAlReves);
    }
    //13. Pedir un número entre 0 y 9.999, decir si es capicúa.
    public static void ej13(){
        int numero;
        int aux;
        int inverso = 0;
        int cifra;
        do {
            System.out.print("Introduce un número entre 0 y 9999: ");
            numero = sc.nextInt();
        } while (numero < 10);

        aux = numero;
        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (numero == inverso) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
    //14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
    public static void ej14(){
        System.out.println("Ingrese una nota del 0 al 10: ");
        double nota = pedirDouble();
        if(nota>10 || nota<0)
            System.out.println("Debe ser entre 0 y 10");
        switch ((int)nota){
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
        }
    }
    //15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos
    //los meses de 30 días
    public static void ej15(){
        System.out.println("Dia del mes: ");
        int dia = pedirInt();
        System.out.println("Mes del año: ");
        int mes = pedirInt();
        System.out.println("Año: ");
        int anio = pedirInt();
        if(dia<1 || dia>30 || mes<1 || mes>12 || anio<1)
            System.out.println("Fecha incorrecta");
        else
            System.out.println("Fecha correcta");
    }
    //16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28,
    //30 y 31 días. Sin años bisiestos.
    public static void ej16(){
        System.out.println("Dia del mes: ");
        int dia = pedirInt();
        System.out.println("Mes del año: ");
        int mes = pedirInt();
        System.out.println("Año: ");
        int anio = pedirInt();
        switch (mes){
            case 2:
                if(dia>28||dia<1)
                    System.out.println("Fecha incorrecta");
                else
                    System.out.println("Fecha correcta");
                break;
            case 1,3,5,7,8,10,12:
                if(dia>31||dia<1)
                    System.out.println("Fecha incorrecta");
                else
                    System.out.println("Fecha correcta");
                break;
            case 4,6,9,11:
                if(dia>30||dia<1)
                    System.out.println("Fecha incorrecta");
                else
                    System.out.println("Fecha correcta");
                break;
        }
    }
    public static void ej17(){

    }
    public static double pedirDouble() {
        return sc.nextDouble();
    }
    public static int pedirInt(){
        return sc.nextInt();
    }
}
