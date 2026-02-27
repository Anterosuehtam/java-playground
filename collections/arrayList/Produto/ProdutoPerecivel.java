package collections.arrayList.Produto;

public class ProdutoPerecivel extends Produto{

    private String dataValidade;

    public ProdutoPerecivel(String nome, int quantidade, double preco, String dataValidade) {
        super(nome, quantidade, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString(){
        return String.format("\nNome: %s, Quantidade: %s, Preco: %s, Data de validade: %s", getNome(), getQuantidade(), getPreco(), dataValidade);
    }
}
