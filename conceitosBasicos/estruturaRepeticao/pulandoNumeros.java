package conceitosBasicos.estruturaRepeticao;

import java.util.Scanner;
/*Gustavo está desenvolvendo um jogo educativo de matemática e deseja um sistema que
exiba os números de 1 até um valor definido pelo usuário, ignorando aqueles que terminam em 5.
Essa mecânica tem o objetivo de tornar o jogo mais desafiador e imprevisível.
Com base nesse cenário, crie um programa que conte de 1 até um número digitado pelo usuário, mas ignore números terminados em 5.

Dica: Para saber se um número termina em 5, sempre dividimos ele por 10 e verificamos o resto da divisão.
Se o resto for 5, significa que o número termina em 5.
*/
public class pulandoNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int limite = scanner.nextInt();
        for (int i = 1; i <= limite; i++) {
            if (i % 10 == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
