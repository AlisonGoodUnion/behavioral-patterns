package desconto;

import desconto.chaincalc.DescontoPorQtdItem;
import desconto.chaincalc.DescontoPorValor;
import desconto.chaincalc.SemDesconto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {

        //Solucao: Chain of Responsibility
        //Extrair cada if em uma classe
        //e cada classe sabe
        //se aplica o desconto ou vai para a proxima etapa de desconto.
        //Outra aplicacao do chain:
        //Nivel de atendimento tecnico ex: N1>N2>N3>Atendimento Presencial.

        SemDesconto semDesconto = new SemDesconto();
        DescontoPorValor descontoPorValor = new DescontoPorValor(semDesconto);
        DescontoPorQtdItem desconto = new DescontoPorQtdItem(descontoPorValor);

        return desconto.calcular(orcamento);
    }
}
