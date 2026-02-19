package conceitosBasicos.exerciciosDiversos;

import java.util.Scanner;

public class calculoIMC {
	public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Vamos calcular o seu IMC!\n");
        System.out.print("Digite a sua atura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        int imc = (int)(peso / (altura * altura));

        if (imc <= 18.5){
            System.out.printf("o seu imc é %s, você está abaixo do peso", imc);
        }
        else if (imc >=18.6 && imc <= 24.9){
            System.out.printf("o seu imc é %s, você está no peso ideal", imc);
        }else if (imc >= 25.0  && imc <= 29.9){
            System.out.printf("o seu imc é %s, você está levemente acima do peso", imc);
        }else if (imc >= 30.0  && imc <= 34.9){
            System.out.printf("o seu imc é %s, Obesidade Grau I", imc);
        }else if (imc >= 35.0  && imc <= 39.9){
            System.out.printf("o seu imc é %s, Obesidade Grau II(Severa)", imc);
        }else if (imc >= 40.0){
            System.out.printf("o seu imc é %s, Obesidade Grau III(Mórbida)", imc);
        }
    }
}
