package com.bank.models;

public class ContaPoupanca extends Conta{
    private double rendimentoAnual;

    public ContaPoupanca(String nif, String numeroConta, double saldo, double rendimentoAnual) {
        super(nif, numeroConta, saldo);
        this.rendimentoAnual = rendimentoAnual;
    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }


    @Override
    public TipoConta getTipoConta() {
        return TipoConta.POUPANCA;
    }
}
