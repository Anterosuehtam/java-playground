package conceitosBasicos.estruturaRepeticao;

import java.util.Scanner;
/*Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos.
Hoje, ela propôs um exercício no qual os alunos devem contar quantos números positivos e
negativos existem em uma sequência de números fornecida por ela.

Ela quer que os alunos criem um programa que permita inserir vários números, um por vez,
e que pare quando o número "fim" for digitado.

*/
public class contandoPositivosNegativos {
    static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        while(true) {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
    }
}
