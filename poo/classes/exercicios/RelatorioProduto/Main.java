package poo.classes.exercicios.RelatorioProduto;
/*
Imagine que você é responsável pelo controle de estoque de uma loja de informática
que está expandindo seus negócios. Com o aumento da demanda, é importante manter um
registro organizado e preciso de todos os produtos disponíveis. Sua tarefa é criar um
sistema que armazene as informações de cada item e gere um relatório para facilitar a gestão do estoque.

Sua tarefa é criar uma classe que:

Represente um produto com os atributos nome, preço e quantidade.
Implemente um metodo que mostre os dados formatados, garantindo
que o preço seja exibido com duas casas decimais.
*/
public class Main {
    static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Mouse gamer");
        produto1.setPreco(159.9);
        produto1.setQuantidade(1);

        produto1.exibirInformacoes();
    }
}
