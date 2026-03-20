package conceitosBasicos.estruturaCondicional;

import java.util.Scanner;
/*Marcos trabalha em uma loja e precisa verificar se um cliente tem direito
a um desconto de 10% em sua compra. O desconto é aplicado apenas se o valor
da compra for maior ou igual a R$ 100,00. Para isso, ele quer um programa que
permita inserir o valor da compra e exiba se o desconto foi aplicado ou não,
juntamente com o novo valor após o desconto, caso aplicável.

Com base nesse cenário, crie um programa que receba o valor da compra
e exiba uma mensagem informando se o desconto foi aplicado ou não.

*/
public class descontoCompras {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.00) {
            double valorDesconto = valorCompra * 0.10;
            valorCompra = valorCompra - valorDesconto;
            System.out.println("Valor do desconto: " + valorDesconto);
            System.out.println("O valor da compra ficou em: " + valorCompra);
        } else {
            System.out.println("Nenhum desconto aplicado!");
            System.out.println("Valor da compra: " + valorCompra);
        }
    }
}
