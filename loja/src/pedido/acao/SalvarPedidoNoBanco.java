package pedido.acao;

import pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no banco");
    }
}
