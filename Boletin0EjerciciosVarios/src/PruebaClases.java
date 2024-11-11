public class PruebaClases {
    public static void main(String[] args) {
        int numero = 2;
        esPrimo(numero);
    }
    public static boolean esPrimo(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}