package conceitosBasicos.estruturaLinear;

import java.util.Scanner;


public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho de um lado de um quadrado (m²): ");
        int lado = scanner.nextInt();
        int area = lado * lado;
        System.out.printf("A área desse quadrado mede %s m²", area);
    }
}
