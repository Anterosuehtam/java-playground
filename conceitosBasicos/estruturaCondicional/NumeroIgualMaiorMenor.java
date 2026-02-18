package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class NumeroIgualMaiorMenor {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira outro número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("O número %s é maior do que o número %s\n", num1, num2);
            System.out.println("Os números são diferentes.");
        } else if (num2 > num1) {
            System.out.printf("O número %s é maior do que o número %s\n", num2, num1);
            System.out.println("Os números são diferentes.");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
