package collections.arrayList.Pessoa;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Ana", 20));
        listaDePessoas.add(new Pessoa("Maria", 27));
        listaDePessoas.add(new Pessoa("Elvira", 9));
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.getFirst());
        System.out.println(listaDePessoas);
    }
}
