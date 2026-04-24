package streams.lambda.exercicios.VerificaNumeroPrimo;

public class Main {
    static void main(String[] args) {
        Primo primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.verificarPrimo(11));  // Resultado: true
        System.out.println(primo.verificarPrimo(12));  // Resultado: false
    }
}
