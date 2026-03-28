package poo.herancaPolimorfismo.exercicios.GerenciamentoBiblioteca;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Revista: \"" + getTitulo() + "\" - Edição: " + edicao);
    }
}
