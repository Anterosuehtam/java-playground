/*
Crie uma classe Produto com atributos como nome, preco, e quantidade.
Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
Implemente o metodo toString() na classe Produto para retornar uma representação em texto do objeto.
Em seguida, imprima a lista de produtos utilizando o metodo System.out.println().
Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
Em seguida, crie objetos Produto utilizando esse novo construtor.
Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize
o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.
* */

package collections.arrayList.Produto;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Queijo", 2, 10.0));
        produtos.add(new Produto("Água", 5, 20.0));
        produtos.add(new Produto("Pão", 1, 5.0));
        System.out.println(produtos.size());
        System.out.println(produtos.get(2));
        System.out.println(produtos);

        produtos.add(new ProdutoPerecivel("Arroz", 5, 50.0, "20-10-2026"));

        System.out.println(produtos.getLast());
    }


}
