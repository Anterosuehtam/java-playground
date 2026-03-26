package poo.classes.exercicios.ResumoLivro;
/*Imagine que você está criando um sistema de catalogação para uma biblioteca.
Seu objetivo é desenvolver uma estrutura que armazene dados de obras literárias
e as exiba em um formato padronizado, facilitando a consulta por outros leitores.

Crie um programa que:

Defina uma classe com os atributos título, autor e páginas.
Implemente um metodo que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.
*/
public class Main {
    static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setTitulo("O Guia do Mochileiro das Galáxias");
        livro1.setAutor("Douglas Adams");
        livro1.setPaginas(208);

        livro1.exibirInformacoes();
    }
}
