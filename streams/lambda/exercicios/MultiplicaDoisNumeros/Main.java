package streams.lambda.exercicios.MultiplicaDoisNumeros;

public class Main {
    static void main(String[] args) {
        Multiplicacao mult = (a, b) -> a * b;
        System.out.println(mult.multiplicacao(5, 3));  // Resultado: 15
    }
}
