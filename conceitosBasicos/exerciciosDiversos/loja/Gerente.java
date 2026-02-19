package conceitosBasicos.exerciciosDiversos.loja;

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean isAdministrador() {
        return true;
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("--- Relatório Financeiro Gerado (Acesso Restrito) ---");
    }

    public void consultarVendas() {
        System.out.println("Gerente consultando todas as vendas da loja...");
    }

    public void exibirInformacoes() {
        System.out.println("\n=== PERFIL GERENTE ===");
        super.exibirDadosComuns();
    }
}