package conceitosBasicos.exerciciosDiversos.loja;

public class Main {
    public static void main (String[] args) {
        Atendente atendente1 = new Atendente("Rafael", "rafael@loja.com", "123", 100.0);

        boolean sucesso = atendente1.realizarLogin("rafael@loja.com", "123");
        if (!sucesso) {
            System.out.println("Programa encerrado por falha de segurança.");
            System.exit(0);
        }
        atendente1.exibirInformacoes();
        atendente1.receberPagamento(50.0);
        atendente1.receberPagamento(25.50);
        atendente1.fecharCaixa();

        // 3. Alterando dados (Herdado)
        System.out.println("\n--- Alteração de Dados ---");
        atendente1.alterarSenha("novaSenha123");
    }
}