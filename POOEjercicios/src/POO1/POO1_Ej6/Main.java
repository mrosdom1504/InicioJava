package POO1.POO1_Ej6;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(15,22,234);
        Tiempo tiempo2 = new Tiempo(3,3,4);
        System.out.println(tiempo.sumar(tiempo,tiempo2));
        System.out.println(tiempo.restar(tiempo,tiempo2));
    }
}
