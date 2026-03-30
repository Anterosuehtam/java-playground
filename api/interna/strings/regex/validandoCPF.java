package api.interna.strings.regex;

import java.util.Scanner;

/*
Roberto está desenvolvendo um sistema de cadastro de clientes e precisa validar
os números de CPF fornecidos. Ele quer um programa que verifique se o CPF está
no formato correto (XXX.XXX.XXX-XX).

Crie um programa que receba um CPF e exiba uma mensagem indicando se o CPF está
no formato válido.
*/
public class validandoCPF {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (cpf.matches(regex)) {
            System.out.println("O CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("O CPF " + cpf + " não está no formato válido.");
        }
    }
}
