package POO1.POO1_Ej8;

public class Terminal {
    protected String numero;
    protected int tiempo = 0;

    public Terminal() {
    }
    public Terminal(String numero) {
        this.numero = numero;
    }

    public String getNum() {
        return numero;
    }

    public void setNum(String numero) {
        this.numero = numero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo += tiempo;
    }

    @Override
    public String toString() {
        return "Nº" + numero + " Tiempo: " + tiempo;
    }
    public void llama(Terminal telefono, int tiempo) {
        this.tiempo += tiempo;
        telefono.setTiempo(tiempo);
    }
}
