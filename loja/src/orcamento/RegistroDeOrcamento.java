package orcamento;

import exception.DomainException;
import http.HttpAdapter;

import java.net.MalformedURLException;
import java.util.Map;

public class RegistroDeOrcamento {

    //classe que funciona como adaptador para diferentes tipos de httpclients.
    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }


    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orxamento nao finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "Valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );
        httpAdapter.post(url, dados);
    }
}
