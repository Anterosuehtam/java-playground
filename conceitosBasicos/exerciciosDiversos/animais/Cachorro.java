package conceitosBasicos.exerciciosDiversos.animais;

public class Cachorro extends Animal {
    private boolean late;

    public Cachorro(String nome, String raca, String porte, int idade, boolean late) {
        super(nome, raca, porte, idade);
        this.late = late;
    }

    @Override
    public void emitirSom(){
        System.out.println("O cachorro " + getNome() + " está emitindo um som!");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("========= Informações sobre o Cachorro ========");
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        System.out.println("Porte: " + getPorte());
        System.out.println("Idade: " + getIdade());
        System.out.println("Late? " + late);

    }
}
