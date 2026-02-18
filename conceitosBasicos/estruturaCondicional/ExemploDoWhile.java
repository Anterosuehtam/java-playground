package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class ExemploDoWhile {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Insira um número para verificar se é POSITIVO, NEGATIVO ou 0: (Digite 999 para encerrar.)");
            numero = scanner.nextInt();

            if (numero == 999) {
                System.out.println("Programa encerrado.\n");
            } else if (numero > 0) {
                System.out.printf("O número %s é positivo\n", numero);
            } else if (numero < 0) {
                System.out.printf("O número %s é negativo\n", numero);
            } else {
                System.out.printf("o número é %s\n", numero);
            }
        }
        while (numero != 999);
    }
}
