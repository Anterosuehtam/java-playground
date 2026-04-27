package streams.lambda.exercicios.ListaInteiros;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);
    }
}
