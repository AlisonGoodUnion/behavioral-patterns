package http;

import java.util.Map;

/**
 * Para não ficar preso em apenas uma mandeira, podemos aplicar o pattern adapter
 * assim cara classe ou lib HTTP que for utilizada pode implementar esse adapter e seguir o contrato.
 * Quando utilizarmos em testes podemos usar a classe que implementa essa interface, e deixar o construtor
 * da classe que realiza o registro recebendo esse httpAdapter.
 * */
public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);
}
