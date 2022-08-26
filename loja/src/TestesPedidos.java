import pedido.GeraPedido;
import pedido.GeraPedidoHandle;
import pedido.LogDePedido;
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
                new EnviarEmailPedido(),
                new LogDePedido()
        );

        //agora passamos as acoes a serem executadas
        //assim novas acoes nao sao necessarias alteracoes no handle
        GeraPedidoHandle handle = new GeraPedidoHandle(acoes);

        //o executar dispara varias tarefas, so que quem define é o cliente
        //mas o cliente não detem informacao de implementacao
        //para o cliente tanto faz como vai ser enviado email, ou salvo o pedido
        //se o pedido salvo for em mongo ou em postgres, tanto faz, mas o cliente
        //que executa a acao.
        handle.execute(geraPedido);

        // sendo assim, e possivel fornecer acesso a uma parte do sistema atraves
        //de uma unica classe e que essa classe pode acabar utilizando varias outras,
        //a vantagem e a simplicidade tendo acesso a parte de um modulo atraves de uma unica
        //classe temos uma interface mais simples.
    }
}
