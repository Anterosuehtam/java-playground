package conceitosBasicos.estruturaRepeticao;

import java.util.Scanner;
/*Pedro quer calcular o fatorial de um número. O fatorial de um número
é o produto de todos os números inteiros positivos de 1 até o próprio número.
Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120. Crie um programa que receba um número e calcule seu fatorial.

*/
public class calculadoraFatorial {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        scanner.close();
    }
}
