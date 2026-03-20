package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;
/*Carlos trabalha em uma empresa de logística que opera apenas
de segunda a sexta, sem atividades nos finais de semana. Para evitar confusões,
ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não.

Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma
mensagem indicando se é um dia útil ou não.
*/
public class diaUtil {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia da semana para saber é dia útil: ");
        String diaSemana = scanner.nextLine();

        if (diaSemana.equals("segunda") || diaSemana.equals("terça") ||
                diaSemana.equals("quarta") || diaSemana.equals("quinta") ||
                diaSemana.equals("sexta")) {
            System.out.println(diaSemana + " é um dia útil.");
        } else {
            System.out.println(diaSemana + " não é um dia útil.");
        }

    }
}
