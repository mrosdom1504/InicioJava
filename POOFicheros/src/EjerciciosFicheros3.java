import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class EjerciciosFicheros3 {
    public static void main(String[] args) {
        ejercicio2();
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
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\usuario\\Desktop\\Documentos\\alumnos_notas.txt"));
            String linea;
            HashMap<String, Integer> estudiantes = new HashMap<>();
            while ((linea = br.readLine()) != null) {
            }
            System.out.println(estudiantes);
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
