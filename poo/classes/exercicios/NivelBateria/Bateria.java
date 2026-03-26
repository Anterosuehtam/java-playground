package poo.classes.exercicios.NivelBateria;

public class Bateria {

    private int nivelbateria;

    public void setNivelbateria(int nivelbateria) {
        if (nivelbateria > 0 && nivelbateria <= 100) {
            this.nivelbateria = nivelbateria;
        }
    }

    public int getNivelbateria() {
        return nivelbateria;
    }

    public void exibeStatus() {
        if (nivelbateria <= 20){
            System.out.println("Bateria fraca.");
        } else if (nivelbateria <= 79) {
            System.out.println("Bateria ok.");
        }else {
            System.out.println("Bateria cheia.");
        }
    }
}
