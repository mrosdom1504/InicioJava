import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosFicheros {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio12();
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
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos2.txt", true));
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Ejercicio 7: Buscar una palabra en un archivo
    //Escribe un programa que busque una palabra específica
    //dentro del archivo `datos.txt` e indique cuántas veces aparece.
    public static void ejercicio7() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            StringBuilder cadena = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                cadena.append(linea).append(" ");
            }
            br.close();

            String[] palabras = cadena.toString().trim().split("\\s+");
            int conteo = 0;
            for (String palabra : palabras) {
                if (palabra.equals("Bienvenido")) {
                    conteo++;
                }
            }
            System.out.println(conteo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //**Ejercicio 9: Renombrar un archivo**
    // Desarrolla un programa que renombre el archivo `datos.txt` a `informacion.txt`,
    // verificando que la operación se haya realizado con éxito.
    public static void ejercicio9() {
        try {
            File archivo = new File("datos9.txt");
            File archivoNuevo = new File("info9.txt");
            if (archivo.renameTo(archivoNuevo))
                System.out.println("El archivo se ha renombrado correctamente de: " + archivo.getName() + " a " + archivoNuevo.getName());
            else
                System.out.println("El archivo no se ha renombrado");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    //**Ejercicio 11: Listar archivos en un directorio**
    // Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual,
    // indicando si cada uno es un archivo o un directorio.
    public static void ejercicio11() {
        File fichero = new File("C:\\Users\\usuario\\IdeaProjects\\InicioJava");
        for (File file : fichero.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.getName() + " es fichero.");
            } else if (file.isDirectory()) {
                System.out.println(file.getName() + " es directorio");
            }
        }
    }
    //**Ejercicio 12: Leer un archivo CSV y mostrar los datos**
    // Crea un programa que lea un archivo CSV llamado `datos.csv` y muestre su contenido en formato tabla.
    public static void ejercicio12() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(",");
                System.out.println(Arrays.toString(palabras));
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //copiar imagen a una nueva imagen
    public static void ejercicio13(String origen, String destino){
        try{
            FileInputStream entrada = new FileInputStream(origen);
            FileOutputStream salida = new FileOutputStream(destino);
            entrada.transferTo(salida);
            entrada.close();
            salida.close();
        }catch (Exception e){
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
        System.out.println("Ejercicio 9:");
        System.out.println("Ejercicio 10:");
        System.out.println("Ejercicio 11:");
        System.out.println("Ejercicio 12:");

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
                ejercicio7();
                break;
        }
    }
}
