package conceitosBasicos.estruturaRepeticao;

import java.util.Scanner;
/*Maria quer calcular a soma de todos os números pares de 1 a 100.
Ela decidiu usar um loop para iterar pelos números e somar apenas
aqueles divisíveis por 2. Crie um programa que realize essa tarefa.*/
public class somaNumerosPares {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
