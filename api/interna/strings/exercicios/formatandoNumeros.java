package api.interna.strings.exercicios;

import java.util.Scanner;
/*Roberto está desenvolvendo um sistema de relatórios financeiros e precisa
formatar valores monetários com duas casas decimais. Construa um programa
que receba um valor monetário e exiba o valor formatado com duas casas decimais.
*/
public class formatandoNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = scanner.nextDouble();

        System.out.printf("Valor formatado: R$ %.2f", valor);
    }
}
