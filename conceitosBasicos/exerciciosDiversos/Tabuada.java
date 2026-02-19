package conceitosBasicos.exerciciosDiversos;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero para gerar a tabuada: ");
        int num = scanner.nextInt();
        System.out.println("Tabuada do " + num);

        for(var i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num  * i);
        }
    }
}
