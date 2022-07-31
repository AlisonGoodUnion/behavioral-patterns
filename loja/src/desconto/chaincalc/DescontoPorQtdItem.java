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
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        //caso a regra 1 nao realizar o calculo, passamos para o proximo.
        return proximo.calcular(orcamento);
    }
}
