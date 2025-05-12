import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class EjPracticos {
    public static void main(String[] args) {
        ej15();
    }
    //Ejercicio 19: Reemplazar una palabra en un archivo
    public static void ej1(String palabraBuscada,String palabraNueva){
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            while((linea = br.readLine()) != null){
                String[] palabra = linea.split(" ");
                for(int i=0; i<palabra.length; i++){
                    if (palabra[i].equals(palabraBuscada)){
                        palabra[i] = palabraNueva;
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 21: Serializar un objeto a archivo
    public static void ej2(){
        Persona persona1 = new Persona("asdd","sadasd",12);
        Persona persona2 = new Persona("asasddd","sahhjdasd",32);
        Persona persona3 = new Persona("asdffsdd","sasfdgdasd",1212);
        List<Persona> personas = Arrays.asList(persona1, persona2, persona3);
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.ser"));
            oos.writeObject(personas);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.ser"));
            System.out.println(ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    //Crea un archivo llamado registro.txt y escribe en él solo si aún no existe.
    public static void ej3(){
        File archivo = new File("registro.txt");
        try{
            if(!archivo.exists()){
                archivo.createNewFile();
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    //Ejercicio 24: Mostrar tamaño de archivo en bytes
    public static void ej4(){
        File archivo = new File("persona.ser");
            System.out.println(archivo.length());
    }
    //Ejercicio 25: Mover archivo a otro directorio
    public static void ej5(){
        File archivoOriginal = new File("datos.txt");
        File carpetaDestino = new File("archivados");

        // Crear la carpeta si no existe
        if (!carpetaDestino.exists()) {
            carpetaDestino.mkdir();
        }

        // Crear el nuevo archivo en la ruta destino
        File archivoNuevo = new File(carpetaDestino, archivoOriginal.getName());

        // Mover el archivo (renombrando con nueva ruta)
        boolean movido = archivoOriginal.renameTo(archivoNuevo);

        if (movido) {
            System.out.println("Archivo movido correctamente a la carpeta 'archivados'.");
        } else {
            System.out.println("No se pudo mover el archivo.");
        }
    }
    //Ejercicio 26: Leer un archivo línea por línea usando Files.readAllLines
    public static void ej6(){
        Path archivo = Paths.get("datos.txt");
        try{
            System.out.println(Files.readAllLines(archivo));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 32: Escribir números del 1 al 100 en un archivo usando PrintWriter
    public static void ej7(){
        try{
            PrintWriter pw = new PrintWriter("datos.txt");
            for(int i=1; i<=100; i++){
                pw.println(i);
            }
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 33: Leer archivo palabra por palabra con Scanner
    public static void ej8(){
        Scanner sc = new Scanner(System.in);
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            while((linea = br.readLine()) != null){
                String[] partes = sc.delimiter().split(linea);
                for(int i=0; i<partes.length; i++){
                    System.out.println(partes[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 34: Calcular la suma de números en un archivo
    public static void ej9(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            int sum = 0;
            while((linea = br.readLine()) != null){
                if(!linea.equals("")){
                    int numero = Integer.parseInt(linea);
                    sum += numero;
                }
            }
            System.out.println(sum);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 35: Contar cuántas líneas tiene un archivo con BufferedReader
    public static void ej10(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            int contador = 1;
            while((linea = br.readLine()) != null){
                contador++;
            }
            System.out.println(contador);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 36: Reemplazar todas las vocales por asteriscos en un archivo
    public static void ej11(){
        try{
            FileReader fr = new FileReader("datos.txt");
            FileWriter fw = new FileWriter("filtrado.txt");
            int caracter;
            int contador = 1;
            while((caracter = fr.read())!=-1){
                if((char)caracter == 'a' || (char)caracter == 'e' || (char)caracter == 'i' || (char)caracter == 'o' || (char)caracter == 'u'){
                    fw.write('*');
                }else{
                    fw.write(caracter);
                }
            }
            fr.close();
            fw.close();
            System.out.println(contador);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 37: Escribir texto en mayúsculas en un nuevo archivo
    public static void ej12(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mayusculas.txt"));
            String linea;
            while((linea = br.readLine()) != null){
                bw.write(linea.toUpperCase());
                bw.newLine();
            }
            br.close();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 38: Duplicar cada línea de un archivo
    public static void ej13(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("2lineas.txt"));
            String linea;
            while((linea = br.readLine()) != null){
                bw.write(linea);
                bw.newLine();
                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Ejercicio 39: Crear un índice de palabras
    public static void ej14(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("IndicePalabras.txt"));

            Map<String, Integer> contador = new HashMap<>();
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    palabra = palabra.toLowerCase().replaceAll("\\p{Punct}", "");
                    if (!palabra.isBlank()) {
                        contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
                    }
                }
            }

            List<String> palabrasOrdenadas = new ArrayList<>(contador.keySet());
            Collections.sort(palabrasOrdenadas);

            for (String palabra : palabrasOrdenadas) {
                bw.write(palabra + ": " + contador.get(palabra));
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("Índice generado correctamente en IndicePalabras.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Crea un programa que lea un archivo persona.json con la información de una persona (nombre, edad, email) y muestre los datos por pantalla.
    public static void ej15(){
        ObjectMapper mapper = new ObjectMapper();
        List<Persona> personas = new ArrayList<>();
        Persona persona = new Persona("sa","sa",21);
        Persona persona1 = new Persona("sad","saerer",2);
        Persona persona2 = new Persona("sasdas","sagg",221);
        personas.add(persona);
        personas.add(persona1);
        personas.add(persona2);

        try{
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new File("persona.json"),personas);
            List<Persona> leidas = Arrays.asList(
                    mapper.readValue(new File("persona.json"),Persona[].class)
            );
            for (Persona persona3 : leidas) {
                System.out.println(persona3);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}