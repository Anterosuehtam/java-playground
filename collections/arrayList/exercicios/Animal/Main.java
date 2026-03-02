package collections.arrayList.exercicios.Animal;
/*Crie uma classe Animal e uma classe Cachorro que herda de Animal.
Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.*/

/*public class Main {
    static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Bidu", "Pequeno");
        Animal animal1 = (Animal) cachorro1;


    }
}*/

/*Modifique o exercício para incluir uma verificação usando instanceof para garantir
que o objeto seja do tipo correto antes de fazer o casting.*/

public class Main {
    static void main(String[] args) {
        Animal animal = new Cachorro("Spyke", "grande");

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um Cachorro");
        }
    }
}