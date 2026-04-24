package streams.lambda.exercicios.TransformaString;

public class Main {
    static void main(String[] args) {
        Transformador toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.transformar("java")); // Esperado: "JAVA"
    }
}
