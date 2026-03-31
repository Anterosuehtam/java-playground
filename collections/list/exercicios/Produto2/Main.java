package collections.list.exercicios.Produto2;

import java.util.ArrayList;

/*Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma
lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.*/
public class Main {
    static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Teclado", 100.0));
        produtos.add(new Produto("Mouse", 300.0));
        produtos.add(new Produto("Monitor", 800.0));

        double somaPrecos = 0;
        for (Produto produto : produtos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / produtos.size();
        System.out.println("O preço médio dos produtos é: R$" + precoMedio);
    }
}
