import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EjerciciosFicheros3 {
    public static void main(String[] args) {
        ejercicio3();
    }

    /*Implementa un programa que muestre por pantalla los valores máximos y mínimos del archivo 'numeros.txt'.*/
    public static void ejercicio1() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\usuario\\Desktop\\Documentos\\numeros.txt"));
            String linea;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while ((linea = br.readLine()) != null) {
                Integer.parseInt(linea);
                if (max < Integer.parseInt(linea)) {
                    max = Integer.parseInt(linea);
                } else if (min > Integer.parseInt(linea)) {
                    min = Integer.parseInt(linea);
                }
            }
            System.out.println(max);
            System.out.println(min);
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*El archivo 'alumnos_notas.txt' contiene una lista de 10 alumnos y las notas que han obtenido en cada asignatura.
     *El número de asignaturas de cada alumno es variable. Implementa un programa que muestre por pantalla la nota media
     *de cada alumno junto a su nombre y apellido, ordenado por nota media de mayor a menor.
     */
    public static void ejercicio2() {
        String nombreArchivo = "C:\\Users\\usuario\\Desktop\\Documentos\\alumnos_notas.txt";
        List<String> alumnos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                String nombreCompleto = partes[0] + " " + partes[1];
                List<Double> notas = new ArrayList<>();
                for (int i = 2; i < partes.length; i++) {
                    notas.add(Double.parseDouble(partes[i]));
                }
                double media = notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
                alumnos.add(nombreCompleto + " " + String.format("%.2f", media));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Notas medias de los alumnos:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

    }
    /*Implementa un programa que pida al usuario un nombre de archivo A para lectura y otro nombre de archivo B para escritura.
    Leerá el contenido del archivo A (por ejemplo 'usa_personas.txt') y lo escribirá ordenado alfabéticamente en B (por ejemplo
    'usa_personas_sorted.txt').*/
    public static void ejercicio3() {
        String nombreArchivo = "C:\\Users\\usuario\\Desktop\\Documentos\\usa_personas.txt";
        List<String> alumnos = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            List<String> personas = new ArrayList<>();

            while ((linea = br.readLine()) != null){
                String[] partes = linea.split(" ");
                String nombreCompleto = partes[0] + " " + partes[1];
                personas.add(nombreCompleto);
            }
            Collections.sort(personas);

            for(String persona : personas){
                System.out.println(persona);
            }
        }catch (IOException e){
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    /*Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres y apellidos de 'usa_nombres.txt'
     y 'usa_apellidos.txt'). Se le pedirá al usuario cuántos nombres de persona desea generar y a qué archivo añadirlos (por ejemplo
      'usa_personas.txt').*/
    public static void ejercicio4() {
        String nombres ="C:\\Users\\usuario\\Desktop\\Documentos\\usa_nombres.txt";
        String apellidos ="C:\\Users\\usuario\\Desktop\\Documentos\\usa_apellidos.txt";
        List<String> nombresPersona = new ArrayList<>();
        List<String> apellidosPersona = new ArrayList<>();
        HashMap<String, String> nombreCompleto = new HashMap<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(nombres));
            String linea;
            while( (linea = br.readLine()) != null){
                String partes = linea;
                nombresPersona.add(partes);
            }
            BufferedReader br2 = new BufferedReader(new FileReader(apellidos));
            String linea2;
            while( (linea2 = br2.readLine()) != null){
                apellidosPersona.add(linea2);
            }
            nombreCompleto.put(nombresPersona.get(0), apellidosPersona.get(0));
        }catch (IOException e){
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
