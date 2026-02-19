package conceitosBasicos.exerciciosDiversos;

import java.util.Scanner;

public class imparPar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = scanner.nextInt();
        while(num2 <= num1){
            System.out.println("\nO segundo número deve ser maior que o primeiro!!!");
            System.out.println("Insira o segundo número: ");
            num2 = scanner.nextInt();
        }
        System.out.println("Escolha entre ímpar ou par: (i/p)");
        String escolha = scanner.next();
        if(escolha.equalsIgnoreCase("i")){
            System.out.println("Você escolheu ímpar! ");
            for (int i = num2; i >= num1; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }else if(escolha.equalsIgnoreCase("p")){
            System.out.println("Você escolheu par! ");
            for (int i = num2; i >= num1; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Opção inválida! Use 'i' para ímpar ou 'p' para par.");
        }
    }

}
