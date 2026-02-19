package conceitosBasicos.exerciciosDiversos.animais;

public class Main {
    static void main(String[] args) {
        Animal animal1 = new Animal("Zoe", "Lulu", "Pequeno", 2);

        animal1.exibirInformacoes();
        animal1.emitirSom();


        Cachorro cachorro1 = new Cachorro("Zoe", "Lulu", "Pequeno", 2, true);
        cachorro1.exibirInformacoes();
        cachorro1.abanarRabo();

        Gato gato1 = new Gato("Zekken", "holandes", "grande", 3, false);
        gato1.exibirInformacoes();
        gato1.emitirSom();
        gato1.arranharMoveis();
    }
}