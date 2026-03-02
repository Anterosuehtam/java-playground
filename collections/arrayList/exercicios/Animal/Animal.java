package collections.arrayList.exercicios.Animal;

public class Animal {
    private String nome;
    private String porte;

    public Animal(String nome, String porte) {
        this.nome = nome;
        this.porte = porte;
    }

    public void andar(){
        System.out.println("O animal está andando");
    }

}
