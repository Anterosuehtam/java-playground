package poo.classes.exercicios.CorrigindoCadastro;

public class Colaborador {
    private String nome;
    private String cargo;
    private int nivelAcesso;

    public Colaborador(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome + "\nCargo atual: " + cargo + "\nNível de acesso: " + nivelAcesso);
    }
    public void atualizarInformacoes(String novoCargo, int novoNivelAcesso){
        cargo = novoCargo;
        nivelAcesso = novoNivelAcesso;
    }

}
