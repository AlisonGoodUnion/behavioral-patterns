import desconto.CalculadoraDeDescontos;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        //Implementamos o pattern chain of resposability
        //e a utilizacao da calculadora continua igual
        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
    }
}
