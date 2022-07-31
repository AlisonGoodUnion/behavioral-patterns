package imposto.strategycalc;

import orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * Polimorfismo cada classe de calculo implementa Imposto.
 * Ex: Classes como ICMS, ISS
 */
public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
