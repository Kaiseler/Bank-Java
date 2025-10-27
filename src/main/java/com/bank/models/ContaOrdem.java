package com.bank.models;

public class ContaOrdem extends Conta{

    private double valorOrdenado;

    public ContaOrdem(String nif, String numeroConta, double saldo, double valorOrdenado) {
        super(nif, numeroConta, saldo);
        this.valorOrdenado = valorOrdenado;
    }

    public double getValorOrdenado() {
        return valorOrdenado;
    }

    public void setValorOrdenado(double valorOrdenado) {
        this.valorOrdenado = valorOrdenado;
    }

    @Override
    public TipoConta getTipoConta() {
        return TipoConta.ORDEM;
    }
}
