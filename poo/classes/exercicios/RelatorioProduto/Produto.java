package poo.classes.exercicios.RelatorioProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirInformacoes(){
        System.out.printf("Produto = %s\n" + "Preço = R$%.2f\nQuantidade em estoque = %s", nome, preco, quantidade);
    }
}
