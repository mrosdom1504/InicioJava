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

    public void esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("No es primo");
                return;
            }
        }
        System.out.println("Es primo");
    }
    public int digitos(int n) {
        if(n<0){
            n=-n;
        }
        if(n==0){
            return 1;
        }else{
            n = n/10;
            n++;
        }
        return n;
    }
    public void voltea(int n) {
        String numero = String.valueOf(n);
        StringBuilder volteado = new StringBuilder(numero).reverse();
        System.out.println(volteado);
    }
}

//