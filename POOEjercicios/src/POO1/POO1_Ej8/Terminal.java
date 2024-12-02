package POO1.POO1_Ej8;

public class Terminal {
    private String num;
    protected int tiempo = 0;

    public Terminal() {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo += tiempo;
    }

    @Override
    public String toString() {
        return "Nº" + num + " Tiempo: " + tiempo;
    }
    public void llama(Terminal telefono, int tiempo) {
        this.tiempo += tiempo;
        telefono.setTiempo(tiempo);
    }
}
