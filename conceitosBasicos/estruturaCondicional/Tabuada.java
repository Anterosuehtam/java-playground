package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para gerar a tabuada: ");
        int num = scanner.nextInt();
        for (int i  = 1; i <= 10; i++){
            System.out.printf("%s x %s = %s\n", num, i, (num * i));
        }
    }
}

