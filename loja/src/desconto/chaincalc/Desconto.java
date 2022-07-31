package desconto.chaincalc;

import orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * heranca para evitar duplicacao de codigo
 */
abstract class Desconto {

    /**
     * Para termos acesso a proxima etapa deve ser protected.
     */
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    /**
     * Cada classe filha vai ser obrigada a ter esse metodo
     */
    public abstract BigDecimal calcular(Orcamento orcamento);
}
