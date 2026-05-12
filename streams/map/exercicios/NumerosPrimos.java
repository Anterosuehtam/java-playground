package streams.map.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosPrimos {
    static void main(String[] args) {
            List<List<Integer>> listaDeNumeros = Arrays.asList(
                    Arrays.asList(1, 2, 3, 4),
                    Arrays.asList(5, 6, 7, 8),
                    Arrays.asList(9, 10, 11, 12)
            );

            List<Integer> numerosPrimos = listaDeNumeros.stream()
                    .flatMap(List::stream)  // Achatar as sublistas em uma única stream
                    .filter(NumerosPrimos::ehPrimo)  // Filtrar apenas números primos
                    .sorted()               // Ordenar em ordem crescente
                    .collect(Collectors.toList()); // Coletar em uma lista

            System.out.println(numerosPrimos); // Saída esperada: [2, 3, 5, 7, 11]

        }

        // Função para verificar se um número é primo
        private static boolean ehPrimo(int numero) {
            if (numero < 2) return false; // Números menores que 2 não são primos
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false; // Divisível por outro número que não 1 e ele mesmo
                }
            }
            return true;
    }
}
