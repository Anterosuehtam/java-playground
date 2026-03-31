package fundamentals.estruturaRepeticao;

import java.util.Scanner;
/*João recebeu uma lista de valores representando as receitas de sua loja de roupas.
Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal.
Crie um programa que ajude João a calcular o valor total.*/

public class somaNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = {10, 20, 30, 40, 50};

        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        System.out.println("A soma total das receitas é de: " + soma);
    }
}
