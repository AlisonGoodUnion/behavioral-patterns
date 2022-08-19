package pedido;

import orcamento.Orcamento;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBanco;

import java.time.LocalDateTime;

public class GeraPedidoHandle {

    //constructor com injecao de dependencias repository, service...
    public GeraPedidoHandle() {
    }

    //Separamos dados de construcao de comportamentos.
    public void execute(GeraPedido dados) {
        //Logica de construcao agora fica centralizada aqui.
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        //Problematica: muita coesao e responsabilidade na classe GerarPedido devemos aplicar um padrão
        //para extrair essas logicas
        //pois a cada nova acao a classe cresce cada vez mais.
        EnviarEmailPedido emailPedido = new EnviarEmailPedido();
        emailPedido.executar(pedido);

        SalvarPedidoNoBanco salvarPedidoNoBanco = new SalvarPedidoNoBanco();
        salvarPedidoNoBanco.executar(pedido);
    }
}
