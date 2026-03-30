package api.interna.strings.exercicios;

import java.util.Scanner;

/*Ana está desenvolvendo um sistema de edição de textos e precisa substituir
uma palavra específica por outra em um texto. Crie um programa que:

Receba um texto, uma palavra a ser substituída e uma nova palavra,
exiba o texto com as substituições realizadas.
Se a palavra a ser substituída não for encontrada no texto, o programa
deve informar ao usuário que a palavra não foi encontrada e encerrar a execução.

*/
public class substituiParteDeString {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto:");
        String texto = scanner.nextLine();
        System.out.println("Digite a palavra a ser substituída: ");
        String substituida = scanner.nextLine();
        System.out.println("Digite a nova palavra: ");
        String substituta = scanner.nextLine();


        if (texto.contains(substituida)) {
            System.out.println("Texto modificado: " + texto.replace(substituida, substituta));
        } else {
            System.out.printf("Palavra '%s' não encontrada no texto. Encerrando aplicação...", substituida);
        }
    }
}
