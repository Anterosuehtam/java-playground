package conceitosBasicos.exerciciosDiversos.loja;

public class Atendente extends Usuario {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha);
        this.valorEmCaixa = valorEmCaixa;
    }

    // --- Gets, Sets ---
    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    @Override
    public boolean isAdministrador() {
        return false;
    }

    public void receberPagamento(double valor) {
        if (valor > 0) {
            this.valorEmCaixa += valor;
            System.out.println("Recebimento de R$ " + valor + " registrado.");
            System.out.println("Novo saldo em caixa: R$ " + this.valorEmCaixa);
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    public void fecharCaixa() {
        System.out.println("==================================");
        System.out.println("Fechando o caixa do atendente " + getNome());
        System.out.println("Valor final em caixa: R$ " + this.valorEmCaixa);
        System.out.println("==================================");
    }


    public void exibirInformacoes(){
        System.out.println("\n============= ATENDENTE =============");
        super.exibirDadosComuns();
        System.out.println("Valor em caixa: " + getValorEmCaixa());
    }
}