package conceitosBasicos.exerciciosDiversos.animais;

public class Gato extends Animal{
    private boolean mia;

    public Gato(String nome, String raca, String porte, int idade, boolean mia) {
        super(nome, raca, porte, idade);
        this.mia = mia;
    }

    @Override
    public void emitirSom(){
        System.out.println("O gato " + getNome() + " está emitindo um som!");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("========= Informações sobre o Gato ========");
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        System.out.println("Porte: " + getPorte());
        System.out.println("Idade: " + getIdade());
        System.out.println("Mia? " + mia);

    }
}
