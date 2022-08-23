package imposto.strategycalc;

import orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * Polimorfismo cada classe de calculo implementa Imposto.
 * Ex: Classes como ICMS, ISS
 */
public abstract class Imposto {

    //autorelacionamento.
    //uma classe decora com ela mesma.
    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

        if (orcamento != null) {
            valorDoOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImposto);
    }
}
