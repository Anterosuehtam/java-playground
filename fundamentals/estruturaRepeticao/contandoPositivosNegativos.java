package fundamentals.estruturaRepeticao;

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

        while (true){
            System.out.println("Digite um número: (digite 'sair' para finalizar o programa)");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")){
                break;
            }

            int num = Integer.parseInt(entrada);
            if (num >= 0){
                positivos ++;
            } else {
                negativos ++;
            }
        }
        System.out.println("Total de números positivos: " + positivos);
        System.out.println("Total de números negativos: " + negativos);
    }
}
