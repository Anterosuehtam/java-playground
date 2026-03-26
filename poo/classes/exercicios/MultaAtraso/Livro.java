package poo.classes.exercicios.MultaAtraso;

public class Livro {
    private String titulo;
    private int diasDeAtraso;

    public Livro(String titulo, int diasDeAtraso) {
        this.titulo = titulo;
        this.diasDeAtraso = diasDeAtraso;
    }

    public void exibirDetalhes(){
        double multa = diasDeAtraso * 2.50;
        System.out.println("Livro: " + titulo);
        System.out.println("multa por " + diasDeAtraso + " dias de atraso: R$" + multa);
    }
}
