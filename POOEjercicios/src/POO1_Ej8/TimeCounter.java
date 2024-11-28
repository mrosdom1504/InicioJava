package POO1_Ej8;

import java.util.Scanner;

public class TimeCounter implements Runnable {
    static Scanner sc = new Scanner(System.in);
    public void run() {
        long startTime = System.currentTimeMillis();
        while(true){
            long currentTime = System.currentTimeMillis();
            String mensaje = sc.nextLine();
             // Convertimos a segundos

            if(mensaje.equals("salir")){
                long elapsedTime = (currentTime - startTime) / 1000;
                System.out.println("Tiempo transcurrido: " + elapsedTime + " segundos");
                System.exit(0);
            }
        }
    }
}
