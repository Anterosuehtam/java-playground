package poo.classes.exercicios.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

/*Você está desenvolvendo o sistema de checkout de um e-commerce de produtos eletrônicos.
Seu desafio é calcular o valor total do carrinho de compras, considerando que cada produto
pode ter quantidades diferentes e preços variados.

Crie um programa que:

Defina uma classe com os atributos nome, preço e quantidade.
Implemente um metodo que retorne o valor total do item (preço x quantidade).
Crie uma lista de item e calcule o valor total da compra.

*/
public class Main {
    static void main(String[] args) {
        Produto i1 = new Produto("Camiseta", 100, 10);
        Produto i2 = new Produto("Calça", 50, 5);
        
        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompra = 0;
        for (Produto item : carrinho) {
            totalCompra += item.calcularTotal();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}
