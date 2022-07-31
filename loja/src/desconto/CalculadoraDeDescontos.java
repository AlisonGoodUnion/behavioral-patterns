package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {

        //Problema: a cada nova regra, teremos um novo if
        //e quanto a ordem dos descontos ? quando tiver mais de 5 itens e for acima de 500?

        //O Strategy talvez nao funcione muito bem aqui :)
        //diferente do strategy onde passamos qual o imposto a ser cobrado.
        //no desconto devemos calcular com base nos dados do orcamento,
        //entao precisamos passar por todos descontos,

        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
