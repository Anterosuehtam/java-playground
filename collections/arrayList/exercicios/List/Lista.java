package collections.arrayList.exercicios.List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Crie uma lista utilizando a interface List e instancie-a tanto como
ArrayList quanto como LinkedList. Adicione elementos e imprima a lista,
mostrando que é possível trocar facilmente a implementação. Modifique o exercício
para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.*/
public class Lista {
    static void main(String[] args) {
        //Primeira parte do enunciado
        /*List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        System.out.println(numeros);

        List<String> nomes = new LinkedList<>();

        nomes.add("João");
        nomes.add("Gustavo");
        nomes.add("Maelle");

        System.out.println(nomes);*/

        //Segunda parte do enunciado
        List<String> lista;

        lista = new LinkedList<>();
        lista.add("5");
        lista.add("10");
        lista.add("15");

        System.out.println(lista);
    }
}
