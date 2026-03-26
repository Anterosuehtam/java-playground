package poo.classes.exercicios.ControleEstoque;

public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void vender(int qtdeVenda){
        if (quantidade >= qtdeVenda){
            quantidade -= qtdeVenda;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        }else {
            System.out.println("Estoque insuficiente");
        }

    }
}
