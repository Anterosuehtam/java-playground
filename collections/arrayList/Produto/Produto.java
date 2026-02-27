package collections.arrayList.Produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return String.format("\nNome: %s, Quantidade: %s, Preco: %s", nome, quantidade, preco);
    }

}
