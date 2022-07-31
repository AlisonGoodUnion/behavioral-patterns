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

    //Esse e o Template Method
    //as logicas sao delegadas para as classes filhas.
    //assim evitamos a implementacao do if e proximo
    //para cada classe filha.
    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);
}
