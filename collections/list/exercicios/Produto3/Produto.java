package collections.list.exercicios.Produto3;

public class Produto {
    private String nome;

    private Double preco;

    private String categoria;

    private boolean disponivel;

    public Produto(String nome, Double preco, String categoria, boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", disponivel=" + disponivel;
    }
}
