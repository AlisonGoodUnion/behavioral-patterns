import http.JavaHttpClient;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;
import java.net.MalformedURLException;

public class TestesAdapter {

    public static void main(String[] args) throws MalformedURLException {
        BigDecimal valor = BigDecimal.TEN;
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();
        orcamento.adicionarItem(new ItemOrcamento(valor));

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
    }
}
