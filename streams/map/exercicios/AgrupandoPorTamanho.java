package streams.map.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupandoPorTamanho {
    static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> stringPorTamanho = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(stringPorTamanho);
    }
}
