package poo.classes.exercicios.ControleTarefas;

public class Tarefa {
    private String descricao;
    private boolean status;

    public Tarefa(String descricao, boolean status) {
        this.descricao = descricao;
        this.status = status;
    }

    public void exibeInfo() {
        String situacao;
        if (status == true) {
            situacao = "Concluída";
        }else{
            situacao = "Pendente";
        }
        System.out.println("Tarefa: " + descricao + " - Status: " + situacao);
    }
}
