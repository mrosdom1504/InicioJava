package Serializacion;

import java.io.*;

public class Transient {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juanito", "213hjfg");
        String archivo = "usuarios.dat";

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject(usuario);
            System.out.println("Usuario serializado realizado correctamente" + usuario);
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        //deserializar

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
            ois.readObject();
            System.out.println("Usuario deserializado realizado correctamente" + usuario);
            ois.close();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
