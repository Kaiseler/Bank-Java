package com.bank.models;

public enum TipoConta {
    POUPANCA("ContaPoupanca", 1), ORDEM("ContaOrdem", 2);

    private String name;
    private int codigoConta;

    public String getName() {
        return this.name;
    }
    public int getCodigoConta(){
        return this.codigoConta;
    }

    TipoConta(String name, int codigoConta) {
        this.name = name;
        this.codigoConta = codigoConta;
    }
}
