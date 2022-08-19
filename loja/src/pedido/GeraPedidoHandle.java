package pedido;

import orcamento.Orcamento;

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

        System.out.println("Salvar pedido no banco");
        System.out.println("Enviar email com dados do pedido.");
    }
}
