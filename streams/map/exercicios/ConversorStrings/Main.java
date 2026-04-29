package streams.map.exercicios.ConversorStrings;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Stream", "Lambda");

        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
