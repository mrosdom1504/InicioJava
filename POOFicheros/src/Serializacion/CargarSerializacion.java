package Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class CargarSerializacion {
    public static void main(String[] args) {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\usuario\\IdeaProjects\\InicioJava\\POOFicheros\\src\\Serializacion\\persona.dat"));
            System.out.println(ois.readObject());
            ois.close();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
