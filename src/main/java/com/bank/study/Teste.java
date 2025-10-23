package com.bank.study;

import com.bank.models.Cliente;
import com.bank.repository.ClienteDAO;
import com.bank.repository.FuncionarioDAO;
import com.bank.models.Funcionario;

public class Teste {
    public static void main(String[] args) {


        Funcionario func1 = new Funcionario("Luis", "12");
        Funcionario func2 = new Funcionario("Armindo", "32");
        FuncionarioDAO teste = new FuncionarioDAO();


        teste.adicionaFuncionario(func1);
        teste.adicionaFuncionario(func2);

        System.out.println(teste.getFuncionario("12"));
        System.out.println(teste.remove("12"));
        System.out.println(teste.getFuncionario("12"));



    }
}
