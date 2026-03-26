package poo.classes.exercicios.CalculaNotas;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void exibirInformacoes() {
        var media = (nota1 + nota2) / 2;
        String situacao;
        if (media >= 7 ) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.println("Aluno: " + nome + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nSituação: " + situacao);
    }
}
