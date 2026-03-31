package fundamentals.estruturaCondicional;

import java.util.Scanner;
/*Emerson trabalha em um banco e precisa verificar se um número digitado
pelo cliente está dentro da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.

Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.*/
public class numEmIntervalo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para saber se está dentro da faixa permitida para empréstimo: ");
        double valor = scanner.nextDouble();

        if (valor >= 1000.00 && valor <= 5000.00) {
            System.out.println("O valor de " + valor + " esta disponível para empréstimo.");
        }else{
            System.out.println("O valor " + valor + " não está disponível para empréstimo.");
        }

    }
}
