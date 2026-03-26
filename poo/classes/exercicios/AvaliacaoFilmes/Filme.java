package poo.classes.exercicios.AvaliacaoFilmes;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;

    private List<Integer> avaliacao;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.avaliacao = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }


    public void adicionarAvaliacao(int nota) {
        if (nota <= 0 || nota > 5) {
            System.out.println("Adicione uma nota entre 1 e 5.");
        } else {
            avaliacao.add(nota);
        }
    }

    public double mediaAvaliacoes() {
        int somaAvaliacoes = 0;
        for (int nota : avaliacao) {
            somaAvaliacoes += nota;
        }
        return (double) somaAvaliacoes / avaliacao.size();
    }
}
