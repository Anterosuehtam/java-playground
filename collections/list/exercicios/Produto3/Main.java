package collections.list.exercicios.Produto3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Geladeira", 2000.00, "Eletrodomestico", true));
        produtos.add(new Produto("Fogão", 1500.00, "Eletrodomestico", false));
        produtos.add(new Produto("Televisão", 5000.00, "Eletrodomestico", true));
        produtos.add(new Produto("Notebook", 10000.00, "Eletronico", true));
        produtos.add(new Produto("Tablet", 6000.00, "Eletronico", false));
        produtos.add(new Produto("Sofá", 7000.00, "Movel", true));
        produtos.add(new Produto("Cadeira Gamer", 500.00, "Movel", false));
        produtos.add(new Produto("Mouse", 400.00, "Periférico", false));
        produtos.add(new Produto("Teclado", 300.00, "Periférico", true));

        //Mostrando todos os produtos
        System.out.println("Mostrando TODOS os produtos: ");
        for (Produto produto : produtos){
            System.out.println(produto);
        }

        System.out.println("\nMostrando apenas produtos DISPONÍVEIS");
        //Mostrando apenas os produtos disponíveis
        produtos.stream()
                        .filter(Produto::isDisponivel)
                                .forEach(System.out::println);

        System.out.println("\nMostrando apenas PERIFÉRICOS");
        //Mostrando apenas os produtos da categoria Periféricos
        for (Produto produto : produtos){
        if (produto.getCategoria().equalsIgnoreCase("Periférico")) {
                System.out.println(produto);
            }
        }

        System.out.println("\nMostrando se a lista possui o Objeto: ");
        //Mostrando se a lista possui o objeto
        boolean encontrou = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase("Rádio")) {
                encontrou = true;
                break;
            }
        }
        if (encontrou) {
            System.out.println("Produto encontrado!");
        }else{
            System.out.println("Produto não encontrado.");
        }

        System.out.println("\nMostrando o produto mais caro: ");
        //Mostrando o produto mais caro
        Produto maisCaro = produtos.get(0);

        for (Produto produto : produtos) {
            if (produto.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto;
            }
        }

        System.out.println(maisCaro);

        //Mostrando produtos acima de 500.00
        System.out.println("\nMostrando produtos acima de 500.00: ");
        List<Produto> produtosMaisCaros = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getPreco() > 500.00) {
                produtosMaisCaros.add(produto);
            }
        }

        for (Produto produtoCaro : produtosMaisCaros) {
            System.out.println(produtoCaro);
        }

        //Mostrando a soma total dos preços
        System.out.println("\nMostrando a soma total dos preços: ");
        double somaTotal = 0.0;
        for (Produto produto : produtos){
            somaTotal += produto.getPreco();
        }
        System.out.println("R$" + somaTotal);

        //Mostrando a média dos preços
        System.out.println("\nMostrando a média dos preços: ");
        double media = somaTotal / produtos.size();
        System.out.println("R$" + media);

        //Removendo todos os produtos indisponíveis da lista
        System.out.println("\nLista sem os produtos indisponíveis: ");
        produtos.removeIf(produto -> !produto.isDisponivel());
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        //Ordenando a lista do menor para o maior valor
        System.out.println("\nLista ordenada de forma crescente: ");
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco))
                .forEach(System.out::println);

        //Ordenando a lista do maior para o menor valor
        System.out.println("\nLista ordenada de forma decrescente: ");
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .forEach(System.out::println);

    }
}
