package com.bank.study;
import com.bank.repository.impl.FuncionarioDAOImpl;
import  com.bank.models.Funcionario;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class TesteFuncionarioDAO {

    public static void main(String[] args) {
        
        FuncionarioDAOImpl funcionarioDAO = new FuncionarioDAOImpl();
        
        Funcionario func1 = new Funcionario("Antonio", "123");
        Funcionario func2 = new Funcionario("Luis", "234");
        Funcionario func3 = new Funcionario("Andre", "174");
        Funcionario func4 = new Funcionario("Sofia", "634");
        Funcionario func5 = new Funcionario("Maria", "726");

        System.out.println("\n---- Teste metodo add() -----");
        
        funcionarioDAO.add(func1);
        funcionarioDAO.add(func2);
        funcionarioDAO.add(func3);
        funcionarioDAO.add(func4);
        funcionarioDAO.add(func5);
        
        List<Funcionario> listaTeste = funcionarioDAO.getAll();

        for(Funcionario func : listaTeste) {
            System.out.println(func);
        }

        System.out.println("\n---- Teste get() - NIF existente ----");
        System.out.println(funcionarioDAO.get("634"));

        System.out.println("\n---- Teste get() - NIF inexistente ----");
        System.out.println(funcionarioDAO.get("999"));



        System.out.println("\n---- Teste remove() -- funcionario existente ---");
        System.out.println("Lista antes de remover");
        listaTeste = funcionarioDAO.getAll();
        for (Funcionario func : listaTeste) {
            System.out.println(func);
        }
        System.out.println(funcionarioDAO.remove("174"));
        System.out.println("\n---- Teste remove() -- funcionario inexistente ---");
        System.out.println(funcionarioDAO.remove("999"));
        System.out.println("Lista depois de remover Andre com o nif 174: ");
        listaTeste = funcionarioDAO.getAll();
         for (Funcionario func : listaTeste){
             System.out.println(func);
         }

         System.out.println("\n----- Teste update com nif certo ----");
         Funcionario luisAtualizado = new Funcionario("Luis Silva", "234");
         System.out.println(funcionarioDAO.update(luisAtualizado, "234"));
         Funcionario luisAtualizado2 = new Funcionario("Luis Meireles", "999");
         System.out.println("\n----- Teste update com nif inexistente ----");
         System.out.println("\n" + funcionarioDAO.update(luisAtualizado2, "999"));

         listaTeste = funcionarioDAO.getAll();

         for(Funcionario func : listaTeste) {
             System.out.println(func);
         }
    }
}
