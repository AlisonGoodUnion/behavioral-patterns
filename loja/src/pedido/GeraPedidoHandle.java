package pedido;

import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandle {
    private List<AcaoAposGerarPedido> acoes;

    //Agora o cosntrutor recebe lista de acoes
    //codigo com menos dependencias.
    public GeraPedidoHandle(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    //Separamos dados de construcao de comportamentos.
    public void execute(GeraPedido dados) {
        //Logica de construcao agora fica centralizada aqui.
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
