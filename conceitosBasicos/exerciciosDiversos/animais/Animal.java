package conceitosBasicos.exerciciosDiversos.animais;

public class Animal {
    private String nome;
    private String porte;
    private String raca;
    private int idade;

    public String getPorte() {
        return porte;
    }
    public String getRaca() {
        return raca;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public Animal(String nome, String raca, String porte, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal " + getNome() + " está emitindo um som!");
    }

    public void exibirInformacoes() {
        System.out.println("========= Informações sobre o animal ========");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Porte: " + porte);
        System.out.println("Idade: " + idade);
    }
}

