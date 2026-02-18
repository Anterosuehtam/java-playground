package conceitosBasicos.estruturaLinear;

import java.util.Scanner;


public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base de um triângulo: ");
        int base = scanner.nextInt();
        System.out.println("Digite a altura de um triângulo: ");
        int altura = scanner.nextInt();
        int area = base * altura;
        System.out.printf("A área desse triângulo mede %s m²", area);
    }
}
