package poo.classes.exercicios.ControleTarefas;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

/*Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar
usuários a organizar suas atividades diárias. Cada tarefa precisa ser registrada com
uma descrição e um status que indique se já foi concluída ou não. Seu objetivo é criar
uma estrutura que armazene essas tarefas e permita visualizá-las.

Crie um programa que:

Defina uma classe com os atributos descrição e concluída.
Implemente um metodo que mostre a descrição da tarefa e seu status.
Crie uma lista de tarefas e exiba todas as tarefas cadastradas. Dica: use ArrayList.
*/
public class Main {
    static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();

        Tarefa t1 = new Tarefa("Estudar java", true);
        Tarefa t2 = new Tarefa("Passear com cachorro", false);
        tarefas.add(t1);
        tarefas.add(t2);

        for (Tarefa t : tarefas){
            t.exibeInfo();
        }
    }
}
