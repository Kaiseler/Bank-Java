package com.bank.study;

import com.bank.models.ContaPoupanca;
import com.bank.repository.impl.ContaDAOImpl;

public class ContaPoupancaImplTeste {

    public static void main(String[] args) {
        ContaPoupanca contaP = new ContaPoupanca("124", "1254", 5000.23, 12000.00);
        ContaPoupanca contaP2 = new ContaPoupanca("346", "4657", 3000.23, 25000.00);
        ContaPoupanca contaP3 = new ContaPoupanca("457", "456", 900.00, 12000.00);
        ContaPoupanca contaP4 = new ContaPoupanca("2346", "1254", 12000.00, 14000.00);

        ContaDAOImpl contas = new ContaDAOImpl();

        System.out.println("--- Metodo add() Teste ---");
        contas.add(contaP);
        contas.add(contaP2);
        contas.add(contaP3);
        System.out.println(contas.getAll());

        System.out.println("\n--- Metodo get() Teste conta que existe---");
        System.out.println(contas.get("4657"));
        System.out.println(contas.get("1254"));

        System.out.println("\n--- Metodo get() Teste conta que nao existe");
        System.out.println(contas.get("575467567"));

        System.out.println("\n--- Metodo remove() ----");
        System.out.println("Conta a ser removida: ");
        System.out.println(contas.get("4657"));
        System.out.println("Conta depois de removida: ");
        System.out.println(contas.remove("4657"));
        System.out.println("Verificacao da conta: ");
        System.out.println(contas.get("4657"));

        System.out.println("\n--- Metodo update() ---");
        System.out.println("\nConta para levar update: ");
        System.out.println(contas.get("1254"));
        System.out.println(contas.update(contaP4,"1254"));
        System.out.println("\nConta depois de update");
        System.out.println(contas.get("1254"));
        System.out.println("\nTodas as contas:");
        System.out.println(contas.getAll());






    }



}
