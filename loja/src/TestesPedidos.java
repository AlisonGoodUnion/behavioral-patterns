import orcamento.Orcamento;
import pedido.GeraPedido;
import pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[2]);
        int quantidadeItens = Integer.parseInt(args[3]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        //independente de qual caminho, agora a construção fica dentro da classe GerarPedido
        //ento a acao pode ser executada por command line ou rest api a logica fica centralizada

        geraPedido.executa();
    }
}
