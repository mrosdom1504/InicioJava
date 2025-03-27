import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class NArchivos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        crearArchivosMultiples("archivo",5);
    }
    /*Crear N archivo, nombre(1).txt, nombre(2).txt,...nombre(n).txt en la carpeta que se solicita al usuario.
    * Dentro de cada archivo debe escribirse la frase "Este es el fichero nombre(n).txt".
    * Utiliza un buffer para la lectura
    * */
    public static void crearArchivosMultiples(String archivo, int nArchivos) {
        System.out.println("Introduzca el path donde desea crear su archivo: ");
        String direccionCarpeta = sc.nextLine();
        try{
            for(int i=1; i<= nArchivos; i++){
                String linea = "Este es el fichero nombre("+i+")";
                BufferedWriter bw = new BufferedWriter(new FileWriter(direccionCarpeta+"/"+archivo+"("+i+")"+".txt"));
                bw.write(linea);
                bw.close();
            }
        }catch (Exception e){
            System.out.println("No se puede leer el archivo");
        }
    }
}
