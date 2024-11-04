import java.util.Scanner;

public class CondicionalesYBucles {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicios();
    }

    //1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
    //un número negativo.
    public static void ej1() {
        int numero = 0;
        boolean esNumeroMayorQueCero = true;
        while (esNumeroMayorQueCero) {
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("Saliendo...");
                esNumeroMayorQueCero = false;
            } else {
                double resultado = Math.pow(numero, 2);
                System.out.println((int) resultado);
            }
        }
    }

    //2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que
    //se introduzca un 0.
    public static void ej2() {
        int numero = 0;
        boolean esNumeroDistintoDeCero = true;
        while (esNumeroDistintoDeCero) {
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Saliendo...");
                esNumeroDistintoDeCero = false;
            } else if (numero > 0) {
                System.out.println("Numero positivo");
            } else
                System.out.println("Numero negativo");
        }
    }

    //3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
    public static void ej3() {
        int numero = 0;
        boolean esNumeroDistintoDeCero = true;
        while (esNumeroDistintoDeCero) {
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Saliendo...");
                esNumeroDistintoDeCero = false;
            } else if (numero % 2 == 0) {
                System.out.println("Numero par");
            } else
                System.out.println("Numero impar");
        }
    }

    //4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han
    //introducido.
    public static void ej4() {
        int numero = 0;
        int contador = 0;
        boolean esNumeroDistintoDeCero = true;
        while (esNumeroDistintoDeCero) {
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("Saliendo...");
                contador--;
                esNumeroDistintoDeCero = false;
            }
            contador++;
        }
        System.out.println(contador);
    }

    //5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir
    //pidiendo números indicando “mayor” o “menor” según sea mayor o menor con
    //respecto a N. El proceso termina cuando el usuario acierta.
    public static void ej5() {
        final int NUMERO = 6;
        int numeroUsuario;
        boolean siNumeroNoSeAcierta = true;
        while (siNumeroNoSeAcierta) {
            System.out.println("Ingresa un numero entre 0 y 10: ");
            numeroUsuario = sc.nextInt();
            if (numeroUsuario == NUMERO) {
                System.out.println("Acertaste");
                siNumeroNoSeAcierta = false;
            } else if (numeroUsuario < NUMERO) {
                System.out.println("Menor");
            } else
                System.out.println("Mayor");
        }
    }

    //6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
    //introducidos.
    public static void ej6() {
        int numero = 0;
        int suma = 0;
        boolean esNumeroDistintoDeCero = true;
        while (esNumeroDistintoDeCero) {
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Saliendo...");
                esNumeroDistintoDeCero = false;
            } else
                suma += numero;
        }
        System.out.println(suma);
    }

    //7. Pedir números hasta que se introduzca uno negativo, y calcular la media.
    public static void ej7() {
        double numero = 0;
        double sumar = 0;
        int contador = 0;
        boolean esNumeroMayorQueCero = true;
        while (esNumeroMayorQueCero) {
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("Saliendo...");
                esNumeroMayorQueCero = false;
            } else {
                contador++;
                sumar += numero;
            }
        }
        System.out.println(sumar/contador);
    }
    //8. Pedir un número N, y mostrar todos los números del 1 al N
    public static void ej8(){
        int numero = 0;
        System.out.println("Ingresa un numero: ");
        numero = sc.nextInt();
        if (numero >= 1) {
            for(int i =1;i<=numero;i++){
                System.out.println(i);
            }
        }else {
            for (int i = 1; i >= numero; i--) {
                System.out.println(i);
            }
        }
    }
    //9. Escribir todos los números del 100 al 0 de 7 en 7.
    public static void ej9() {
        for(int i = 100;i>0;i-=7){
            System.out.println(i);
        }
    }
    //10. Pedir 15 números y escribir la suma total.
    public static void ej10() {
        int contador = 0;
        int suma = 0;
        while(contador<15){
            contador++;
            System.out.println("Ingresa un numero: ");
            int numero = sc.nextInt();
            suma += numero;
        }
        System.out.println(suma);
    }
    //11. Diseñar un programa que muestre el producto de los 10 primeros números impares.
    public static void ej11() {
        int aux=1;
        for(int i=0;i<=19;i++){
            if(i%2==1){
                System.out.println(aux*=i);
            }
        }
    }
    //12. Pedir un número y calcular su factorial
    public static void ej12() {
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();
        int resultado = 1;
        for(int i = 1;i<=numero;i++){
            resultado *= i;
        }
        System.out.println("Resultado: " + resultado);
    }
    //13. Pedir 10 números. Mostrar la media de los números positivos, la media de los
    //números negativos y la cantidad de ceros
    public static void ej13() {
        int numero = 0;
        int contador = 0;
        int contadorCeros = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int sumarPositivos = 0;
        int sumarNegativos = 0;
        while(contador<10){
            contador++;
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();
            if (numero < 0) {
                contadorNegativos++;
                sumarNegativos += numero;
            } else if (numero > 0) {
                contadorPositivos++;
                sumarPositivos += numero;
            }else
                contadorCeros++;
        }
        if(contadorPositivos>0)
            System.out.println("Resultado Positivos: " + sumarPositivos/contadorPositivos);
        if(contadorNegativos>0)
            System.out.println("Resultado Negativos: " + sumarNegativos/contadorNegativos);
        System.out.println("Resultado Ceros: " + contadorCeros);
    }
    //14. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€
    public static void ej14() {
        int contador = 0;
        int sueldoMayorQueMil = 0;
        int sumar = 0;
        while (contador<10){
            contador++;
            System.out.println("Ingresa un numero: ");
            int numero = sc.nextInt();
            sumar += numero;
            if (numero > 1000) {
                sueldoMayorQueMil++;
            }
        }
        System.out.println(sumar);
        System.out.println("Hay "+sueldoMayorQueMil+" Sueldos de mas de 1000€");
    }
    //15. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la
    //cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más
    //de 1.75.
    public static void ej15() {
        int contador = 0;
        int contadorMayorDeEdad = 0;
        int contadorAltura = 0;
        while (contador<5){
            contador++;
            System.out.println("Ingresa la edad: ");
            int edad = sc.nextInt();
            System.out.println("Ingresa la altura en metros: ");
            double altura = sc.nextDouble();
            if (edad>=18)
                contadorMayorDeEdad++;
            if (altura>1.75)
                contadorAltura++;
        }
        System.out.println(contadorMayorDeEdad+" Alumno/s mayores de edad");
        System.out.println(contadorAltura+" Alumno/s de mas de 1.75m");
    }
    //16. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de
    //dicho número
    public static void ej16() {
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+"*"+i+"="+i*numero);
        }
    }
    //17. Una empresa que se dedica a la venta de desinfectantes necesita un programa para
    //gestionar las facturas. En cada factura figura: el código del artículo, la cantidad
    //vendida en litros y el precio por litro. Se pide de 5 facturas introducidas: Facturación
    //total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de
    //más de 600 €
    public static void ej17() {
        int contador = 0;
        while (contador<5){
            contador++;
            System.out.println("Ingresa el codigo del articulo: ");
            int codigoArticulo = sc.nextInt();
            System.out.println("Ingresa el cantidad vendida en litros: ");
            int cantidadLitros = sc.nextInt();
            System.out.println("Ingresa el precio por litro: ");
            int precioLitro = sc.nextInt();
            System.out.println("El articulo nº="+codigoArticulo+" tiene una facturación de= "+cantidadLitros*precioLitro);
        }
    }
    //18. Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo
    //existen tres productos con precios: 1: 0,6 €/litro, 2: 3 €/litro y 3: 1,25 €/litro.
    public static void ej18() {
        int contador = 0;
        while (contador<5){
            contador++;
            System.out.println("Ingresa el codigo del articulo: ");
            int codigoArticulo = sc.nextInt();
            switch (codigoArticulo){
                case 1:
                    System.out.println("Ingresa los litros que desea: ");
                    int litros = sc.nextInt();
                    System.out.println("Precio Final= "+litros*0.6);
                    break;
                case 2:
                    System.out.println("Ingresa los litros que desea: ");
                    litros = sc.nextInt();
                    System.out.println("Precio Final= "+litros*3);
                    break;
                case 3:
                    System.out.println("Ingresa los litros que desea: ");
                    litros = sc.nextInt();
                    System.out.println("Precio Final= "+litros*1.25);
                    break;
            }
        }
    }
    //19. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y
    //suspensos.
    public static void ej19() {
        int contador = 0;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        while (contador<6){
            contador++;
            System.out.println("Ingresa la nota: ");
            double nota = sc.nextDouble();
            if(nota>=5){
                aprobados++;
            } else if (nota>=4&& nota<5) {
                condicionados++;
            }else
                suspensos++;
        }
        System.out.println(aprobados+" alumnos aprobados");
        System.out.println(condicionados+" alumnos condicionados");
        System.out.println(suspensos+" alumnos suspensos");
    }
    //20. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
    public static void ej20() {
        int contador = 0;
        double sueldoMaximo = 0;
        System.out.println("Ingresa el numero de sueldos: ");
        contador = sc.nextInt();
        while (contador>0){
            contador--;
            System.out.println("Ingresa el sueldo: ");
            double sueldo = sc.nextDouble();
            if (sueldo>sueldoMaximo){
                sueldoMaximo=sueldo;
            }
        }
        System.out.println(sueldoMaximo);
    }
    //21. Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
    public static void ej21() {
        int contador = 0;
        boolean siNumeroEsNegativo = false;
        while (contador<10){
            contador++;
            System.out.println("Ingresa un numero: ");
            int numero = sc.nextInt();
            if (numero<0){
                siNumeroEsNegativo = true;
            }
        }
        if (siNumeroEsNegativo){
            System.out.println("Se introdujo algun numero negativo");
        }else
            System.out.println("No se introdujo algun numero negativo");
    }
    //22. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
    public static void ej22() {
        int contador = 0;
        boolean siCalificacionSuspensa = false;
        while (contador<5){
            contador++;
            System.out.println("Ingresa la calificacion: ");
            double calificacion = sc.nextInt();
            if (calificacion<5){
                siCalificacionSuspensa = true;
            }
        }
        if (siCalificacionSuspensa){
            System.out.println("Hay algun suspenso");
        }else
            System.out.println("No hay ningun suspenso");
    }
    //23. Pedir 5 números e indicar si alguno es múltiplo de 3.
    public static void ej23() {
        int contador = 0;
        boolean esMultiploDeTres = false;
        while (contador<5){
            contador++;
            System.out.println("Ingresa un numero: ");
            int numero = sc.nextInt();
            if (numero%3==0){
                esMultiploDeTres = true;
            }
        }
        if (esMultiploDeTres){
            System.out.println("Alguno es multiplo de 3");
        }else
            System.out.println("Ninguno es multiplo de 3");
    }
    public static void ejercicios(){
        ej1();
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
        ej16();
        ej17();
        ej18();
        ej19();
        ej20();
        ej21();
        ej22();
        ej23();
    }
}
