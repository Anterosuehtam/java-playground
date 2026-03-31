package fundamentals.estruturaCondicional;

import java.util.Scanner;

public class mediaNotas {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("O estudante teve média " + media + " e foi aprovado");
        }else if (media >= 5.0) {
            System.out.println("O estudante teve média " + media + " e está de recuperação");
        }else{
            System.out.println("O estudante teve média " + media + " e foi reprovado");
        }

    }
}
