import pedido.GeraPedido;
import pedido.GeraPedidoHandle;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[2]);
        int quantidadeItens = Integer.parseInt(args[3]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        //independente de qual caminho, agora a construção fica dentro da classe GerarPedido
        //ento a pedido.acao pode ser executada por command line ou rest api a logica fica centralizada
        GeraPedidoHandle handle = new GeraPedidoHandle(/** injecao de dependencias */);
        handle.execute(geraPedido);
    }
}
