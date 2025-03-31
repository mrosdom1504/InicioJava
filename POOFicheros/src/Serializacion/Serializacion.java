package Serializacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe",12);

        //Serializar (Guardar un objeto en archivo binario)

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\usuario\\IdeaProjects\\InicioJava\\POOFicheros\\src\\Serializacion\\persona.dat"));
            oos.writeObject(p1);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
