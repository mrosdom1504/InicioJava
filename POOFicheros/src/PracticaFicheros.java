import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticaFicheros {
    public static void main(String[] args) {
        try {
            File fichero = new File("fichero.txt");
            fichero.createNewFile();
            FileReader fr = new FileReader(fichero);
            FileWriter fw = new FileWriter(fichero,true);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fw.write("Hola Mundo\n");
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
