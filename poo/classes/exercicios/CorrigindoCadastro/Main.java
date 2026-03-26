package poo.classes.exercicios.CorrigindoCadastro;
/*Você está desenvolvendo um sistema de controle de colaboradores para uma empresa de tecnologia.
Às vezes, é necessário atualizar o cargo e o nível de acesso de um funcionário devido a promoções
ou mudanças de departamento. Seu programa deve permitir essas alterações e mostrar as informações
atualizadas.

Crie uma classe que:

Represente um colaborador com os atributos nome, cargo e nivel de acesso.
Implemente um metodo que permita alterar o cargo e o nível de acesso.
Exiba no console as informações antes e depois da atualização.
*/
public class Main {
    static void main(String[] args) {
        Colaborador colaborador = new Colaborador("Matheus", "Estagiário Java", 3);

        System.out.println("------- Antes da atualização --------");
        colaborador.mostrarInformacoes();
        colaborador.atualizarInformacoes("Desenvolvedor Java Júnior", 2);
        System.out.println("\n------- Depois da atualização --------");
        colaborador.mostrarInformacoes();
    }
}
