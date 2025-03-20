import java.io.*;
import java.util.Scanner;

public class EjerciciosFicheros {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio7();
    }

    //Ejercicio 1: Crear y escribir en un archivo
    //Crea un programa en Java que cree un archivo de texto llamado `datos.txt`
    //y escriba dentro de él un mensaje de bienvenida.
    public static void ejercicio1() {
        File fichero = new File("datos.txt");
        try {
            fichero.createNewFile();
            FileWriter fw = new FileWriter(fichero);
            fw.write("Bienvenido");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Ejercicio 2: Leer un archivo carácter por carácter
    //Escribe un programa en Java que lea el archivo `datos.txt` carácter por carácter
    //y muestre el contenido en la pantalla.
    public static void ejercicio2() {
        File fichero = new File("datos.txt");
        try {
            FileReader fr = new FileReader(fichero);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Ejercicio 3: Leer un archivo línea por línea
    //Desarrolla un programa en Java que lea el archivo `datos.txt` línea
    //por línea e imprima cada línea en la consola.
    public static void ejercicio3() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Ejercicio 4: Agregar contenido a un archivo
    //Modifica el archivo `datos.txt` para agregar nuevas
    //líneas de texto sin borrar el contenido anterior.
    public static void ejercicio4() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt", true));
            bw.newLine();
            bw.write("Nueva linea");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Ejercicio 5: Contar palabras en un archivo
    //Crea un programa que cuente el número total de palabras
    //en el archivo `datos.txt` y muestre el resultado en la consola.
    public static void ejercicio5() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            StringBuilder cadena = new StringBuilder();

            while ((linea = br.readLine()) != null) {
                cadena.append(linea).append(" ");
            }
            br.close();

            String[] palabras = cadena.toString().trim().split("\\s+");
            int cantidadPalabras = palabras.length;

            System.out.println(cantidadPalabras);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Ejercicio 6: Copiar el contenido de un archivo a otro
    //Crea un programa que copie el contenido de `datos.txt` en un
    //nuevo archivo llamado `copia.txt`, manteniendo el mismo formato.
    public static void ejercicio6() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            StringBuilder cadena = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                cadena.append(linea+"\n");
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos2.txt", true));
            bw.write(cadena.toString().trim());
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 7: Buscar una palabra en un archivo
    //Escribe un programa que busque una palabra específica
    //dentro del archivo `datos.txt` e indique cuántas veces aparece.
    public static void ejercicio7() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            StringBuilder cadena = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                cadena.append(linea).append(" ");
            }
            br.close();

            String[] palabras = cadena.toString().trim().split("\\s+");
            int conteo = 0;
            for (String palabra : palabras){
                if (palabra.equals("Bienvenido")){
                    conteo++;
                }
            }
            System.out.println(conteo);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void menu() {
        int opcion;
        System.out.println("¿Que ejercicio desea elegir?");
        opcion = sc.nextInt();
        System.out.println("Ejercicio 1:");
        System.out.println("Ejercicio 2:");
        System.out.println("Ejercicio 3:");
        System.out.println("Ejercicio 4:");
        System.out.println("Ejercicio 5:");
        System.out.println("Ejercicio 6:");
        System.out.println("Ejercicio 7:");
        System.out.println("Ejercicio 8:");

        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
        }
    }
}
