package pedido;

import java.math.BigDecimal;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    // injecao de dependencias: PedidoRepository, EmailService...
    // para desacoplar a representação das informacoes
    // podemos criar os handles, um para representar os dados e uma para executar.
    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    //podemos melhorar o padrão utilizando polimorfismo,
    //criando uma interface e implementando em todas classes command
    //um avariacao e o Command Handle

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
