package desconto.chaincalc;

import orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * Final do fluxo Chain
 */
public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
