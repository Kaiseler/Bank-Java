package com.bank.study;

import com.bank.models.Conta;
import com.bank.models.ContaOrdem;
import com.bank.models.ContaPoupanca;
import com.bank.models.TipoConta;

public class MainEnum {

    public static Conta contaFactory(String nif, String numeroConta, double saldo) {
        if (saldo < 1000) {
            return new ContaPoupanca(nif, numeroConta, saldo, 0);
        } else {
            return new ContaOrdem(nif, numeroConta, saldo, 0);
        }
    }

    public static void main(String[] args) {




        Conta conta = contaFactory("1243", "4567", 1000.99);

        System.out.println(conta instanceof ContaPoupanca);

    }
}
