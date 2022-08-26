package pedido;

import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandle {
    //lista acoes representa padrao observer apos gerar pedido.
    private List<AcaoAposGerarPedido> acoes;

    //Agora o cosntrutor recebe lista de acoes
    //codigo com menos dependencias.
    public GeraPedidoHandle(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    //Separamos dados de construcao de comportamentos.
    public void execute(GeraPedido dados) {
        //Logica de construcao agora fica centralizada aqui.
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        //chama automaticamente a classe de log caso passe ela como param.
        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
