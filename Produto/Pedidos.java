package Produto;

public class Pedidos {
    private String nomePedido;
    private int quantidadeVendida;
    private int quantidadeEnviada;
    private String prazoEntrega;
    private String logisticaDeEnvio;
    private String cliente;

    public Pedidos() {

    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        if (quantidadeVendida < 0) {
            throw new IllegalArgumentException("Valor inválido");
        } else {
            this.quantidadeVendida = quantidadeVendida;
        }
    }

    public int getQuantidadeEnviada() {
        return quantidadeEnviada;
    }

    public void setQuantidadeEnviada(int quantidadeEnviada) {
        if (quantidadeEnviada < quantidadeVendida) {
            throw new IllegalArgumentException("Quantidade que está sendo enviada é menor do que a quantidade mínima para envio!!GIT ");
        } else {
            this.quantidadeEnviada = quantidadeEnviada;
        }
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getLogisticaDeEnvio() {
        return logisticaDeEnvio;
    }

    public void setLogisticaDeEnvio(String logisticaDeEnvio) {
        this.logisticaDeEnvio = logisticaDeEnvio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            throw new IllegalArgumentException("Cliente inválido");
        }
    }
}
