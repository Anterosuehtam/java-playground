package streams.reduce.exercicios;

import java.util.Arrays;
import java.util.List;

public class ReduzindoListaInteiros {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        int somaDosQuadrados = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(somaDosQuadrados);
    }
}
