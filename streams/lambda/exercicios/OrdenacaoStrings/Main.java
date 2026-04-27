package streams.lambda.exercicios.OrdenacaoStrings;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> nomes = Arrays.asList("Matheus", "Enzo", "Ana", "Renato", "Tania", "Pedro", "Elizbeth");

        // nomes.sort((a, b) -> a.compareTo(b));
        nomes.sort(String::compareTo);
        System.out.println(nomes);
    }
}
