package api.utils.strings.exercicios;

import java.util.Scanner;

/*
Carlos está desenvolvendo um sistema de relatórios e precisa padronizar o
texto para que todos os títulos estejam em maiúsculas e as descrições em minúsculas.
Faça um programa que receba um texto e exiba o texto em maiúsculas e o texto em minúsculas.
*/
public class converteMaiusculasParaMinusculas {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.println("Texto em maiúsculas: " + texto.toUpperCase());
        System.out.println("Texto em minúsculas: " + texto.toLowerCase());
    }
}
