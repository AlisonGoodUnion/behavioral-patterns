package desconto.chaincalc;

import orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * utilizamos heranca herdamos caracteristicas de desconto.
 */
public class DescontoPorQtdItem extends Desconto {

    public DescontoPorQtdItem(Desconto proximo) {
        //construtor da classe mãe, atribuindo proximo desconto.
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
