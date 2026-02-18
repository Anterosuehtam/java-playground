package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class Exercicio08 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaNotas = 0;
        double nota = 0;
        int totalNota = 0;

        while (nota != -1) {
            System.out.println("Digite uma nota para o filme ou digite -1 para cancelar: ");
            nota = scanner.nextDouble();

            if(nota != -1) {
                mediaNotas += nota;
                totalNota++;
            }
        }

        System.out.println("A média final do filme é: " + mediaNotas / totalNota);
    }
}
