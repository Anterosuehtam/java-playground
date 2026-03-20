package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

/*Ana precisa identificar se um número é par ou ímpar para um jogo
que está desenvolvendo. Para isso, deseja criar um programa que analisa
se o número que ela definiu previamente é par ou ímpar.
Como você ajudaria Ana a escrever um programa que determine se um número
é par ou ímpar e exiba o resultado corretamente?
*/
public class parOuImpar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = "";
        while(!entrada.equalsIgnoreCase("sair")){
            System.out.println("Digite um número para verificar se é par ou ímpar: (digite 'sair' para encerrar o programa)");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);

                if (numero % 2 == 0) {
                    System.out.println("O número é par.");
                }else {
                    System.out.println("O número é ímpar.");
                }

            }catch (NumberFormatException e){
                System.out.println("Entrada inválida! Digite um número ou 'sair'.");
            }
        }

    }
}
