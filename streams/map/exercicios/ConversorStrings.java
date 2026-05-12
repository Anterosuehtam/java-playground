package streams.map.exercicios;

import java.util.Arrays;
import java.util.List;

public class ConversorStrings {
    static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");

        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
