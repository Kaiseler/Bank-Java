package com.bank.study;

import com.bank.models.ContaOrdem;


public class ContaOrdemImplTeste {
    public static void main(String[] args) {

        ContaOrdemDAOImpl testeImpl = new ContaOrdemDAOImpl();


        ContaOrdem ordem1 = new ContaOrdem("1243", "124", 1000.23, 1000.34);
        System.out.println("\n -----Teste metodo add  -----");
        testeImpl.add(ordem1);
        System.out.println(testeImpl.get("124"));

        System.out.println("\n ---- Teste metodo get conta que existe ----");
        System.out.println(testeImpl.get("124"));
        System.out.println("\n ---- Teste metodo get conta que nao existe");
        System.out.println(testeImpl.get("999"));

        System.out.println("\n --- Teste metodo remove com conta que nao existe----");
        System.out.println(testeImpl.remove("999"));
        System.out.println("\n --- Teste metodo remove com conta que existe ---");
        System.out.println(testeImpl.remove("124"));

        ContaOrdem ordem2 = new ContaOrdem("777", "344", 1200.00, 10000);
        testeImpl.add(ordem1);
        testeImpl.add(ordem2);

        System.out.println(testeImpl.getAll());

        ContaOrdem ordem3 = new ContaOrdem("134", "344", 1500.00, 30000);

        System.out.println(testeImpl.update(ordem3,"344"));

        System.out.println(testeImpl.get("344"));


        System.out.println("\n Teste getAll");
        System.out.println(testeImpl.getAll());



    }
}
