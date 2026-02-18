package conceitosBasicos.estruturaLinear;

import java.util.Scanner;


public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa 1: ");
        String nome1 = scanner.next();
        System.out.println("Digite a idade da pessoa 1: ");
        int idade1 = scanner.nextInt();
        System.out.println("Digite o nome da pessoa 2: ");
        String nome2 = scanner.next();
        System.out.println("Digite a idade da pessoa 2: \n");
        int idade2 = scanner.nextInt();
        int diferenca = Math.abs(idade2 - idade1);
        System.out.printf("%s tem %s anos\n%s tem %s anos\nA diferença de idade entre eles é de %s anos \n", nome1, idade1, nome2, idade2, diferenca);
    }
}
