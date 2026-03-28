package poo.herancaPolimorfismo.exercicios.SistemaEscolar;
/*Você está desenvolvendo um sistema de gestão para uma escola, onde
é necessário organizar informações de alunos e docentes. Cada pessoa na
escola possui dados básicos, como nome e idade. No entanto, cada grupo
também possui características próprias: os alunos possuem uma nota final
e os docentes são responsáveis por uma disciplina.

Crie um programa que:

Defina uma classe Pessoa com os atributos nome e idade.
Crie as classes Aluno e Docente, ambas herdando de Pessoa, adicionando:
Para Aluno: um atributo nota.
Para Docente: um atributo disciplina.
Instancie dois objetos Aluno e dois objetos Docente
Exiba as informações no terminal.

*/
public class Main {
    static void main() {
        Aluno aluno1 = new Aluno("Julia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.2);

        Docente docente1 = new Docente("Marta", 40, "Matemática");
        Docente docente2 = new Docente("Roberto", 38, "História");

        aluno1.exibirDados();
        aluno2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
