package collections.arrayList.exercicios.CartaoCredito;

import java.util.Scanner;

/*
Criar uma aplicação para lançamento de compras com cartão de crédito.
 - Menu para lançamento de compras;
 - Exibição da lista de compras realizadas e ordenadas por valor;
O menu é para realizar as compras, ou seja, essas compras deverão ser armazenadas
em uma lista e depois essa lista deve ser exibida e ordenada por valor.

*/
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        Cartao cartao = new Cartao(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            Produto compra = new Produto(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        for (Produto c : cartao.getProdutos()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());


    }
}
