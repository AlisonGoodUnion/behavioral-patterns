import orcamento.Orcamento;
import pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String cliente = "Joao da Silva";
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

        //Simulacao de criaca de pedido
        //Extrair essas logicas do codigo de apresentacao/construcao do pedido/cliente/orcamento.
        System.out.println("Salvar pedido no banco");
        System.out.println("Enviar email com dados do pedido.");


    }
}
