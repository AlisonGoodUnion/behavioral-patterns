package orcamento;

import orcamento.situacao.EmAnalise;
import orcamento.situacao.Finalizado;
import orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<ItemOrcamento> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    //Solucao: aplicando abstração nao precisamos mais IF Else.
    // entao para aplicar o desconto, pegamos a situacao atual
    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    //e a regra para navegar esta em cada situacao
    //cada situacao sabe se pode ou nao aprovar/reprovar/finalizar.
    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public int getQuantidadeItens() {
        return this.itens.size();
    }

    public SituacaoOrcamento getSituacao() {
        return this.situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(ItemOrcamento item) {
        this.itens.add(item);
        this.valor = valor.add(item.getValor());
    }
}
