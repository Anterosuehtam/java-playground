package collections.arrayList.exercicios.Strings;
/*Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.*/

import java.util.ArrayList;

public class Strings {
    static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Mouse");
        strings.add("Teclado");
        strings.add("Notebook");
        strings.add("Console");

        for(String string : strings) {
            System.out.println(string);
        }
    }
}
