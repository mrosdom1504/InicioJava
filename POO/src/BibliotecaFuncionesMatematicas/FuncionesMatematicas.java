package BibliotecaFuncionesMatematicas;

public class FuncionesMatematicas {
    public void esCapicua(int n){
        int aux;
        int inverso = 0;
        int cifra;
        //le damos la vuelta al número
        aux = n;
        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (n == inverso) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }

    public boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
