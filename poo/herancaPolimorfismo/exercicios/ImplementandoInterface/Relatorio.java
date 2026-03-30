package poo.herancaPolimorfismo.exercicios.ImplementandoInterface;

import java.sql.SQLOutput;

public class Relatorio implements Imprimivel{

    private String titulo;

    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Título: " + titulo + "\nConteúdo: " + conteudo);
    }
}
