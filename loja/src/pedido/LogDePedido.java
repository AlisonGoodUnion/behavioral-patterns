package pedido;

import pedido.acao.AcaoAposGerarPedido;

public class LogDePedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado:" + pedido);
    }
}
