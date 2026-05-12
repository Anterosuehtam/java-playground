package streams.filter.exercicios;

import java.util.Arrays;
import java.util.List;

public class MaiorNumeroInteiro {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        numeros.stream()
                .max(Integer::compare)
                .ifPresent(System.out::println);

    }
}