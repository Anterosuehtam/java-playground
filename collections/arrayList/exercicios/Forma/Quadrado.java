package collections.arrayList.exercicios.Forma;

public class Quadrado implements Forma {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

}
