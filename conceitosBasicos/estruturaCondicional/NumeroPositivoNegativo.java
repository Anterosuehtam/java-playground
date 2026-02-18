package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class NumeroPositivoNegativo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("Insira um número para verificar se é ímpar ou par: (digite -1 para sair)");
            int numero = scanner.nextInt();

            if (numero == -1) {
                System.out.println("Programa encerrado.");
                break; // para o while
            }

            if(numero % 2 == 0) {
                System.out.println("O número é par!");
            }else {
                System.out.println("O número é ímpar!");
            }
        }

    }
}
