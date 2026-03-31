package fundamentals.estruturaCondicional;


import java.util.Scanner;
/*Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um
programa que compare dois números inteiros fornecidos pelo usuário e informe
qual é o maior ou se são iguais. Mas, ele está com dificuldades para implementar
lógica de comparação e exibir o resultado corretamente.

Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois
números inteiros, compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.*/
public class comparaNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira outro número inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        } else if (num2 > num1) {
            System.out.println("O número " + num2 + " é maior que o número " + num1);
        }else{
            System.out.println("Os números são iguais.");
        }

    }
}
