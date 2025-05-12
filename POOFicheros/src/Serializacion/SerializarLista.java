package Serializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarLista {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add( new Persona("Juan", 12));
        listaPersonas.add( new Persona("Jesus", 23));
        listaPersonas.add( new Persona("Antonio", 54));
        listaPersonas.add( new Persona("Pepe", 76));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ListaPersonas.dat"));
            oos.writeObject(listaPersonas);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ListaPersonas.dat"));
            System.out.println(ois.readObject());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
