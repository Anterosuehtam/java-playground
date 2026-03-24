package conceitosBasicos.estruturaRepeticao;
import java.util.Scanner;
/*Pedro quer calcular o fatorial de um número. O fatorial de um número
é o produto de todos os números inteiros positivos de 1 até o próprio número.
Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120. Crie um programa que receba um número e calcule seu fatorial.

*/
public class calculadoraFatorial {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular a fatorial: ");
        int num = scanner.nextInt();

        /*Aqui, precisamos inicializar uma variável de controle para chamá-la dentro do loop. A função dela é armazenar um
        cálculo que será feito utilizando a variável i, toda vez que o i receber um número, esse número vai ser
        multiplicado pelo que já tem dentro da nossa variável de controle, sucessivamente até o i atingir o valor máximo
        que declaramos dentro do nosso laço (nesse caso, o 5).*/
        int fatorial = 1;
        for (int i = 1; i <= num ; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
