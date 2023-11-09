package pessoa.filhos;

import Produto.Pedidos;

public class Cliente extends Pessoa {
    private String cpf;
    private String cnpj;
    private String tipoCliente;
    public Pedidos pedidos = new Pedidos();

    public Cliente (){}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    //Criando dos métodos do atributo "têm um" nesta classe
    public void setNomePedido (String nomePedido) {
        pedidos.setNomePedido(nomePedido);
    }

    public String getNomePedido () {
        return pedidos.getNomePedido();
    }

    public void setQuantidadeVendida (int quantidadeVendida) {
        pedidos.setQuantidadeVendida(quantidadeVendida);
    }

    public int getQuantidadeVendida () {
        return pedidos.getQuantidadeVendida();
    }

    public void setQuantidadeEnviada (int quantidadeEnviada) {
        pedidos.setQuantidadeEnviada(quantidadeEnviada);
    }

    public int getQuantidadeEnviada () {
        return pedidos.getQuantidadeEnviada();
    }

    public void setPrazoEntrega (String prazoEntrega) {
        pedidos.setPrazoEntrega(prazoEntrega);
    }

    public String getPrazoEntrega () {
        return pedidos.getPrazoEntrega();
    }

    public void setLogisticadeEnvio (String logisticaDeEnvio) {
        pedidos.setLogisticaDeEnvio(logisticaDeEnvio);
    }

    public String getLogisticadeEnvio () {
        return pedidos.getLogisticaDeEnvio();
    }


}
