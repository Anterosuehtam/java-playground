package streams.lambda.exercicios.MultiplicaDoisNumeros;

public class Main {
    static void main(String[] args) {
        Calculadora mult = (a, b) -> a * b;
        Calculadora sum = (a, b) -> a + b;

        System.out.println(mult.calcula(5, 3));  // Resultado: 15
        System.out.println(sum.calcula(5, 3));  // Resultado: 8
    }
}
