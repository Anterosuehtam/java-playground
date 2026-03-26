package poo.classes.exercicios.ControleEstoque;
/*Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa
garantir que o estoque seja atualizado corretamente a cada venda realizada. Seu programa
deve processar as vendas e alertar quando não houver produtos suficientes no estoque.

Crie um programa que:

Defina uma classe com os atributos nome e quantidade.

Implemente um metodo que:
Subtraia a quantidade vendida do estoque se houver disponibilidade.
Exiba uma mensagem formatada com o saldo atual usando printf
Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.
*/
public class Main {
    static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 20);

        produto.vender(15);
        produto.vender(3);
        produto.vender(2);
    }
}
