import imposto.CalculadoraDeImpostos;
import imposto.strategycalc.ICMS;
import imposto.strategycalc.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        //podemos usar o polimorfismo com interface ou classes abstratas
        //para que não tenhamos mais esses if e elses
        //e cada classe tem a sua implementação
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
