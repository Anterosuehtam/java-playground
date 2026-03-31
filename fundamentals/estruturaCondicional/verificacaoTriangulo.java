package fundamentals.estruturaCondicional;

import java.util.Scanner;
/*Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo.
Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado.
Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.*/
public class verificacaoTriangulo {
     static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Insira o tamanho do primeiro lado do triângulo: ");
         int lado1 = scanner.nextInt();

         System.out.println("Insira o tamanho do segundo lado do triângulo: ");
         int lado2 = scanner.nextInt();

         System.out.println("Insira o tamanho terceiro lado do triângulo: ");
         int lado3 = scanner.nextInt();

         if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
             System.out.println("Os lados podem formar um triângulo.");
         }else {
             System.out.println("Os lado não podem formar um triângulo.");
         }


    }
}
