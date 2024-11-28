package POO1_Ej8;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal("675 84 32 54");
        Thread timer = new Thread(new TimeCounter());
        timer.start();
    }
}
