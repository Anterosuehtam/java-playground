package conceitosBasicos.exerciciosDiversos;

import java.util.Scanner;

public class numeroInicialNnumeros {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        while(true){
            System.out.println("Informe o número para verificação: \n");
            int toVerify = scanner.nextInt();
            if (toVerify < number) {
                System.out.printf("Informe um número maior que %s \n", number);
                continue;
            }
            var result = toVerify % number;
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
            if (result != 0) break;


        }
    }
}
