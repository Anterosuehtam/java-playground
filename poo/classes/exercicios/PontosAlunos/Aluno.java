package poo.classes.exercicios.PontosAlunos;

public class Aluno {
    private String nome;

    private int pontos;

    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    public void ganharPontos(int quantidade){
        this.pontos += quantidade;
        atualizarNivel();
    }

    public void atualizarNivel(){
        this.nivel = (pontos / 100) + 1;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontos: " + this.pontos);
        System.out.println("Nivel: " + this.nivel);
    }



}
