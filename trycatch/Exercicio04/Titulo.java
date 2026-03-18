package trycatch.Exercicio04;

public class Titulo {
    private String nome;

    private int anoLancamento;

    private String autor;

    public Titulo(String nome, String autor, int anoLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "[Nome do título: " + nome + "]" + ","
                + "[Autor: " + autor + "]" + ","
                + "[Ano de lançamento: " + anoLancamento + "]";
    }
}
