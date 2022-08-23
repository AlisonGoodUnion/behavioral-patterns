import imposto.CalculadoraDeImpostos;
import imposto.strategycalc.ICMS;
import imposto.strategycalc.ISS;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.ONE));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        //podemos usar o polimorfismo com interface ou classes abstratas
        //para que não tenhamos mais esses if e elses
        //e cada classe tem a sua implementação
        //Decoramos um imposto com outro imposto.
        System.out.println(calculadora.calcular(orcamento,
                new ISS(
                        new ICMS(null)
                )));

        System.out.println(calculadora.calcular(orcamento,
                new ICMS(
                        new ISS(null)
                )));
    }
}
