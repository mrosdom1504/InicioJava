package POO1.POO1_Ej10;

public class Ameba {
    private int peso = 3;

    public Ameba() {
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Ameba{" + "peso=" + peso + '}';
    }

    public void come(int peso){
        this.peso += peso-1;
    }
    public void come(Ameba a){
        this.peso += a.getPeso()-1;
        a.setPeso(0);
    }
}
