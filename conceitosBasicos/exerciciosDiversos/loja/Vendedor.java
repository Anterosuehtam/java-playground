package conceitosBasicos.exerciciosDiversos.loja;

import conceitosBasicos.exerciciosDiversos.loja.Usuario;

public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        super(nome, email, senha);
        this.quantidadeVendas = quantidadeVendas;
    }

    // Getter/Setter
    public int getQuantidadeVendas() { return quantidadeVendas; }
    public void setQuantidadeVendas(int quantidadeVendas) { this.quantidadeVendas = quantidadeVendas; }

    @Override
    public boolean isAdministrador() {
        return false;
    }

    public void realizarVenda() {
        this.quantidadeVendas++;
        System.out.println("Venda realizada! Total de vendas: " + this.quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Minhas vendas acumuladas: " + this.quantidadeVendas);
    }

    public void exibirInformacoes() {
        System.out.println("\n=== PERFIL VENDEDOR ===");
        super.exibirDadosComuns();
        System.out.println("Vendas realizadas: " + this.quantidadeVendas);
    }
}