package orcamento;

import java.math.BigDecimal;
import java.util.List;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

}
