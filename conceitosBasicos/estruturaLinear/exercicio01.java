package conceitosBasicos.estruturaLinear;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class exercicio01 {

    public static void  main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Digite seu nome: \n");
        String nome = scanner.next();
        System.out.print("Digite digite o ano de seu nascimento: \n");
        int ano = scanner.nextInt();
        int idadeAtual = OffsetDateTime.now().getYear() - ano;
        System.out.printf("Olá %s, você tem %s anos! ", nome, idadeAtual);
        }
}

