package collections.arrayList.exercicios.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Crie uma classe Titulo com um atributo nome do tipo String.
Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
Crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o metodo Collections.sort
para ordenar a lista e, em seguida, imprima os títulos ordenados.*/
public class Main {
    static void main(String[] args) {
        List<Titulo> nomes = new ArrayList<>();

        nomes.add(new Titulo("Avatar"));
        nomes.add(new Titulo("Transformers"));
        nomes.add(new Titulo("Carros"));

        Collections.sort(nomes);

        for (Titulo titulo : nomes) {
            System.out.println(titulo.nome);
        }

    }
}
