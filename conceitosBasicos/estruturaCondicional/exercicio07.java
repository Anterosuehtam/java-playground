package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class exercicio07 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira as notas dadas a um filme para fazer a média geral:");
            nota = scanner.nextDouble();
            media = media + nota / 3;
        }
        System.out.println("média: " + media);
    }
}
