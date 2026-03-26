package poo.classes.exercicios.CalculaNotas;
/*Imagine que você está desenvolvendo um sistema acadêmico simplificado para
auxiliar professores no acompanhamento de alunos. Seu desafio é criar uma solução
que automatize o cálculo de médias e forneça rapidamente o resultado, eliminando a
necessidade de cálculos manuais e reduzindo erros.

Crie uma classe que:

Represente os alunos com os atributos nome, nota 1´ e nota 2`.

Implemente um metodo que:
Calcule a média das notas.
Exiba o nome do aluno, suas notas e a média (com uma casa decimal).
Indique se o aluno foi aprovado (média >= 7) ou reprovado.*/
public class Main {
    static void main(String[] args) {

        Aluno aluno = new Aluno("Matheus", 10.0, 8.0);
        aluno.exibirInformacoes();
    }
}
