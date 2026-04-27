package streams.lambda.exercicios.Palindromo;

public class Main {
    static void main(String[] args) {
        Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("radar"));
        System.out.println(palindromo.verificarPalindromo("ana"));
        System.out.println(palindromo.verificarPalindromo("ovo"));
        System.out.println(palindromo.verificarPalindromo("Matheus"));
    }
}
