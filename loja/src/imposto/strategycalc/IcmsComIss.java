package imposto.strategycalc;

import orcamento.Orcamento;

import java.math.BigDecimal;

// e se amanha surgir um imposto novo ? com IPI?
// para cada combinacao sera criada uma nova classe?
// nao esta bacana, vai gerar um problema
// qual seria a solucao para nao ter mais classes com impostos?
public class IcmsComIss implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal icms = new ICMS().calcular(orcamento);
        BigDecimal iss = new ISS().calcular(orcamento);
        return icms.add(iss);
    }
}
