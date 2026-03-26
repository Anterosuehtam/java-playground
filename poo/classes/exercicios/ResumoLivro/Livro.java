package poo.classes.exercicios.ResumoLivro;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void exibirInformacoes(){
        System.out.printf("%s de %s com %s páginas.", titulo, autor, paginas);
    }
}
