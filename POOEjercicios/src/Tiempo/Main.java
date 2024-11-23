package Tiempo;

public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(1,22,234);
        Tiempo tiempo2 = new Tiempo(2,3,4);
        System.out.println(tiempo.sumar(tiempo,tiempo2));
        System.out.println(tiempo.restar(tiempo,tiempo2));
    }
}
