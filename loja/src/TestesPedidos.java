import pedido.GeraPedido;
import pedido.GeraPedidoHandle;
import pedido.acao.AcaoAposGerarPedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Joao";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        List<AcaoAposGerarPedido> acoes = Arrays.asList(
                new SalvarPedidoNoBanco(),
                new EnviarEmailPedido());

        //agora passamos as acoes a serem executadas
        //assim novas acoes nao sao necessarias alteracoes no handle
        GeraPedidoHandle handle = new GeraPedidoHandle(acoes);
        handle.execute(geraPedido);
    }
}
