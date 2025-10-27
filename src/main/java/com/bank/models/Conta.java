package com.bank.models;

public abstract class Conta {





    private String nif;
    private String numeroConta;
    private double saldo;



    public Conta(String nif, String numeroConta, double saldo) {
        this.nif = nif;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }



    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract TipoConta getTipoConta();

    @Override
    public String toString(){
        return  "Dados da conta: " +
                "\nNIF: " + this.nif +
                "\nNumero de Conta: " + this.numeroConta +
                "\nSaldo" + this.saldo;
    }
}
