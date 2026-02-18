package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;

public class CalcularArea {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============ ESCOLHA UMA DAS OPÇÕES ===========");
        System.out.println("1. Calcular área do quadrado\n2. Calcular área do círculo \n");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Insira o tamanho do lado do quadrado: (m²)");
            int lado = scanner.nextInt();
            int area = lado * lado;

            System.out.printf("A área de um quadrado com %sm² de lado é %s.\n", lado, area);
        } else if (opcao == 2) {
            System.out.println("Insira o RAIO do círculo:");
            int raio = scanner.nextInt();
            double area = 3.14 * (raio * raio);
            System.out.printf("A área do cículo cujo o raio mede %s é de %sm²", raio, area);
        }
        else {
            System.out.println("Opcão inválida");
        }
    }
}
