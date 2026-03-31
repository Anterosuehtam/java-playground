package collections.list.exercicios.CartaoCredito;

import java.util.ArrayList;
import java.util.List;

public class Cartao {

    private double limite;
    private double saldo;
    private List<Produto> produtos;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.produtos = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public boolean lancaCompra(Produto produto) {
        if(this.saldo >= produto.getValor()) {
            this.saldo -= produto.getValor();
            this.produtos.add(produto);
            return true;
        }

        return false;
    }
}
