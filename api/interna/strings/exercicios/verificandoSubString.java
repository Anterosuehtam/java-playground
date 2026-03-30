package api.interna.strings.exercicios;

import java.util.Scanner;

/*Laura está desenvolvendo um sistema de busca e precisa verificar se uma
palavra específica está presente em um texto. Crie um programa que receba
um texto e uma palavra, e exiba uma mensagem indicando se a palavra está presente no texto.
*/
public class verificandoSubString {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (texto.contains(palavra)){
            System.out.printf("A palavra '%s' está presente no texto.", palavra);
        }else {
            System.out.printf("A palavra '%s' não está presente no texto.", palavra);
        }
    }
}
