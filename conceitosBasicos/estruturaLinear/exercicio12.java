package conceitosBasicos.estruturaLinear;
/*Você está desenvolvendo um jogo e quer um programa que determine se um número é par ou ímpar.
Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.*/
public class exercicio12 {
    static void main(String[] args) {
        int numero = 8;

        if(numero % 2 == 0) {
            System.out.println("O número é par.");
        }else {
            System.out.println("O número é ímpar");
        }
    }
}
