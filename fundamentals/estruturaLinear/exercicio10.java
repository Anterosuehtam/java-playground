package fundamentals.estruturaLinear;
/*Você está iniciando suas atividades como pessoa desenvolvedora e foi designado
para criar um programa de cadastro de livros que será escolhida através de um único caractere.

O sistema armazenar em variáveis:
Título
Autor
Número de páginas
Preço de um livro

Categoria do livro As categorias disponíveis são:
F - Ficção
N - Não-ficção
T - Tecnologia
H - História
Escreva um programa que armazene em variáveis as informações de um livro e com base na
categoria armazenada exiba uma mensagem de confirmação de acordo com o que foi escolhido.*/
public class exercicio10 {
    static void main(String[] args) {
        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numPaginas = 96;
        double precoLivro = 39.9;
        char categoria = 'F';

        String categoriaDescricao;

        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        }else if (categoria == 'N') {
            categoriaDescricao = "Não-ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Categoria inválida";
        }
        System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui " + numPaginas +" páginas, custa R$" + precoLivro +" e pertence à categoria " + categoriaDescricao + ".");


    }
}
