import http.JavaHttpClient;
import orcamento.Orcamento;
import orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;
import java.net.MalformedURLException;

public class TestesAdapter {

    public static void main(String[] args) throws MalformedURLException {
        BigDecimal valor = BigDecimal.TEN;
        int quantidadeItens = 10;
        Orcamento orcamento = new Orcamento(valor, quantidadeItens);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
    }
}
