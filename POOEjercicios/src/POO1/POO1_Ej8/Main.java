package POO1.POO1_Ej8;

public class Main {
    public static void main(String[] args) {
        Terminal t1 = new Terminal();
        Terminal t2 = new Terminal();
        Terminal t3 = new Terminal();
        Terminal t4 = new Terminal();
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}