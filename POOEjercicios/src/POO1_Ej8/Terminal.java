package POO1_Ej8;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Terminal {
    static Scanner sc = new Scanner(System.in);
    private String num;

    public Terminal(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    public void mensaje() {
        TimeCounter tc = new TimeCounter();
        tc.run();
    }

    @Override
    public String toString() {
        return "Nº" + num;
    }
}
