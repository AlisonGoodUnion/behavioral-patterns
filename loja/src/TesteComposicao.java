import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        //reaproveitar orcamento antigo
        novo.adicionarItem(antigo);

        //Imprime a soma dos itens
        //Compondo objetos com outros.
        System.out.println(novo.getValor());
    }
}
