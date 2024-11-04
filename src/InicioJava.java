import java.util.ArrayList;
import java.util.Scanner;

public class InicioJava {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
        //ej6();
        //ej7();
        //ej8();
        //ej9();
        ej10();
    }

    //Leer una cantidad ‘N’ y luego introducir ‘N’ números enteros. Se pide imprimir
    //el mayor y el menor y las veces que aparece cada uno.
    public static void ej1() {
        int mayor = 0;
        int menor = 100;
        int conteoMayor = 0;
        int conteoMenor = 0;
        int[] numeros = new int[]{12, 123, 123, 4, 5};
        for (int numero : numeros) {
            if (numero >= mayor) {
                mayor = numero;
            } else if (numero <= menor) {
                menor = numero;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == mayor) {
                conteoMayor++;
            }
            if (numeros[i] == menor) {
                conteoMenor++;
            }
        }
        System.out.println(mayor + "," + menor);
        System.out.println("El menor se repite: " + conteoMenor + " Y el mayor: " + conteoMayor);
    }

    //Introducir 10 números y decir si alguno ha sido negativo e indicar el valor
    //máximo introducido.
    public static void ej2() {
        int numero;
        int mayor = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            if (numero > mayor)
                mayor = numero;
            if (numero < 0)
                System.out.println("El numero: " + numero + " es negativo.");
        }
        System.out.println("El numero mayor es : " + mayor);
    }

    //Dado un número, determinar cuántos dígitos tiene. No se pueden utilizar ni
    //variables ni funciones de tipo String.
    public static void ej3() {
        int numero = 123;
        int contador = 0;
        if (numero == 0) {
            contador = 1;
        } else {
            while (numero != 0) {
                numero /= 10;
                contador++;
            }
        }

        System.out.println("El número tiene " + contador + " dígitos.");
    }

    //Escribir un programa en java para introducir un número y obtener como
    //resultado si es o no capicúa. Se considerará capicúa si el primer dígito y el
    //último son iguales. No se pueden utilizar ni variables ni funciones de tipo
    //String.
    public static void ej4() {
        int numero;
        int aux;
        int inverso = 0;
        int cifra;
        do {
            System.out.print("Introduce un número >= 10: ");
            numero = sc.nextInt();
        } while (numero < 10);

        //le damos la vuelta al número
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

    //Introducir un número del 1 al 10 y mostrar su tabla de multiplicar.
    public static void ej5() {
        System.out.println("¿Cual tabla quiere ver?: ");
        int tabla = sc.nextInt();
        int multiplicacion = 0;
        for (int i = 1; i <= 10; i++) {
            multiplicacion = i * tabla;
            System.out.println(multiplicacion);
        }
    }

    //Escribir un algoritmo que pida números enteros hasta que se introduzca un
    //valor menor o igual a cero. A continuación debe mostrar la suma total de
    //dichos números. Se deben incluir todos los números que hemos ido
    //introduciendo por teclado. (Ejemplo. 3+4+5+6+8=26)
    public static void ej6() {
        int sumar = 0;
        int numero = 0;
        StringBuilder numeros = new StringBuilder();
        boolean seSiguenPidiendoNumeros = true;
        while (seSiguenPidiendoNumeros) {
            System.out.println("Ingresa un numero, pulse -1 para salir: ");
            numero = sc.nextInt();
            if (numero <= 0)
                seSiguenPidiendoNumeros = false;
            else {
                numeros.append(numero + "+");
                sumar += numero;
            }
        }
        System.out.println("La suma de los numeros anteriores es: " + numeros + "=" + sumar);
    }

    //Crea un programa en JAVA que dado un número, nos muestre dicho número
    //con las cifras invertidas. No se pueden utilizar variables de tipo String.
    //Ejemplo; 12345 -> 54321
    public static void ej7() {
        int numero;
        int invertido = 0;
        int resto;

        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        System.out.println("Número invertido: " + invertido);
    }

    //Dada una secuencia de números enteros acabada en 0, obtener la suma de
    //aquellos números tales que su número de cifras sea igual a la suma de las
    //mismas. Entrada: 1 5 111 66 201 273 0 | Salida: 1 + 111 + 201= 313
    public static void ej8() {
        ArrayList<char[]> numeros = new ArrayList<>();
        ArrayList<Integer> numerosSeleccionados = new ArrayList<>();
        StringBuilder numerosSumados = new StringBuilder();
        int sumar = 0;
        int sumarNumeros = 0;
        int contador = 0;
        numeros.add("12".toCharArray());
        numeros.add("1".toCharArray());
        numeros.add("111".toCharArray());
        numeros.add("201".toCharArray());
        numeros.add("0".toCharArray());
        for (char[] numero : numeros) {
            sumar = 0;
            contador = 0;
            for (char c : numero) {
                contador += 1;
                sumar += Integer.parseInt(String.valueOf(c));
            }
            if (sumar == contador) {
                numerosSeleccionados.add(Integer.parseInt(String.valueOf(numero)));
            }
        }
        for (Integer numero : numerosSeleccionados) {
            sumarNumeros += numero;
            if (numerosSeleccionados.indexOf(numero) == numerosSeleccionados.size() - 1) {
                numerosSumados.append(numero);
            } else {
                numerosSumados.append(numero + " + ");
            }
        }
        System.out.println(numerosSumados + "= " + sumarNumeros);
    }

    //9. Crea un programa que reciba un carácter. Si el carácter está en minúsculas,
    //debe imprimir en pantalla el mismo carácter en mayúsculas, y viceversa. La
    //única función de la clase String que se puede utilizar es CharAt().
    public static void ej9() {
        char caracter;
        System.out.println("Introduce un caracter: ");
        caracter = sc.next().charAt(0);
        if (caracter == Character.toUpperCase(caracter)) {
            System.out.println("El caracter es mayuscula: " + caracter);
        } else
            System.out.println("El caracter no es mayuscula: " + caracter);
    }

    //10.Crea un programa en JAVA que dibuje N-1 cuadrados de lado 2 hasta lado N.
    //Es decir, de pequeño a grande. Los cuadrados estarán formados por el
    //carácter que hace referencia a la longitud del lado.
    public static void ej10() {
        int altura;
        System.out.println("Introduce un altura: ");
        altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            System.out.println();
            for (int k = 1; altura >= k; k++) {
                System.out.print(altura);
            }
        }
        while (altura > 2) {
            altura--;
            for (int j = 1; j <= altura; j++) {
                System.out.println();
                for (int k = 1; altura >= k; k++) {
                    System.out.print(altura);
                }
            }
        }
    }
}




