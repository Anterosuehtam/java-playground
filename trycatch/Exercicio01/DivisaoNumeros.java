package trycatch.Exercicio01;
/*Crie um programa simples que solicita dois números ao usuário e realiza a divisão
do primeiro pelo segundo. Utilize o bloco try/catch para tratar a exceção que pode
ocorrer caso o usuário informe 0 como divisor.*/

import java.util.Scanner;

public class DivisaoNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = scanner.nextInt();

        System.out.println("Informe o denominador: ");
        int divisor = scanner.nextInt();

        try {
            int divisao = numerador / divisor;
            System.out.println("Resultado da divisão: " + divisao);

        } catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
}
