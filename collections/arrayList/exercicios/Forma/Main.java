package collections.arrayList.exercicios.Forma;
import java.util.ArrayList;
/*Crie uma interface Forma com um metodo calcularArea(). Implemente a interface em duas
classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma)
e utilize um loop para calcular e imprimir a área de cada forma.*/

public class Main {
    static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Quadrado(10));
        formas.add(new Circulo(3));
        formas.add(new Quadrado(5));

        for (Forma item : formas) {
            System.out.println("Área: " + item.calcularArea());
        }
    }
}
