import java.io.*;

/*Programa que recibe el nombre de un archivo como argumento y muestra su contenido en la consola*/
public class LectorArchivo {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                for (String arg : args) {
                    BufferedReader br = new BufferedReader(new FileReader(arg));
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                    }
                    br.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("No hay argumentos");
        }
        soutToPrintWriter();
    }

    public static void ej1(String entrada) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(entrada));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void soutToPrintWriter() {
        PrintWriter pw = new PrintWriter(System.out);
        pw.print("Hello World");
        pw.close();
    }
}
