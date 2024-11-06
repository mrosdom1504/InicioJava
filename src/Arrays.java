import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //explicacion();
        //ej1();
        ej2();
    }
    public static void explicacion() {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Pepe");
        nombres.add("Pepe");
        nombres.add("Pepe");
        nombres.add("Pepe");

        System.out.println("Listado nombres: "+nombres);

        //Acceder a elemento especifico
        System.out.println("Primer nombre: "+nombres.get(0));
        System.out.println("Segundo nombre: "+nombres.get(1));

        //Cambiar un elemento
        nombres.set(0, "Antonio");
        System.out.println(nombres);
        /*
        * add():Metodo para agregar items
        * get():Permite acceder a un item por su index
        * set():Cambia un elemento de una posicion especifica
        */
    }
    //Realizar operaciones de:
    //iteración y manipulación de elementos
    public static void ej1() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Cereza");
        frutas.add("Aceituna");
        for(int i = 0; i < frutas.size(); i++){
            System.out.println("Fruta "+ (i+1) + ": "+frutas.get(i));
        }
        int contador = 0;
        for(String fruta : frutas){
            System.out.println("Fruta "+(contador+1)+": "+fruta);
            contador++;
        }
        //Eliminar un elemento
        frutas.remove("Cereza");
        frutas.remove(1);
        System.out.println(frutas);
    }
    //Buscar un elemento
    //Clonar o copiar el arraylist
    //vaciar o limpiar los elementos del arraylist
    public static void ej2() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println("¿Que elemento desea buscar?:");
        int num = sc.nextInt();
        if (numeros.contains(num)) {
            System.out.println("Numero encontrado");
        }else
            System.out.println("Numero no encontrado");
        ArrayList<Integer> numeros2;
        numeros2 = numeros;
        System.out.println(numeros2);
        numeros.clear();
        System.out.println(numeros);
    }
}
