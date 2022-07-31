package orcamento;

import java.math.BigDecimal;
import java.util.List;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private String situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    //PROBLEMA: nova situacao de desconto (Desconto Extra)
    //caso o cliente peça mais desconto como vamos fazer?.
    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = BigDecimal.ONE;

        if (situacao.equals("EM ANALISE")) {
            valorDescontoExtra = new BigDecimal("0.05");
        }
        if (situacao.equals("APROVADO")) {
            valorDescontoExtra = new BigDecimal("0.05");
        }

        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        //situacoes tem um anterior/proximo.
        this.situacao= "APROVADO";
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

}
