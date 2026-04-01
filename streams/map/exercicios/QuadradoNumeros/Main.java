package streams.map.exercicios.QuadradoNumeros;

import java.util.List;
import java.util.stream.Collectors;

/*Você está desenvolvendo uma aplicação matemática que precisa calcular
o quadrado de uma lista de números. Essa funcionalidade será usada para
gerar gráficos e análises estatísticas. Para resolver essa tarefa você deve:

Criar uma lista contendo os números fornecidos.
Calcular o quadrado de cada número utilizando o metodo map.
Criar uma nova lista contendo os resultados.
Exibir a lista de quadrados no console.

*/
public class Main {
    static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadradoNumeros = numeros.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("Quadrados dos números: " + quadradoNumeros);
    }
}
