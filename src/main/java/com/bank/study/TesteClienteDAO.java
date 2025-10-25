package com.bank.study;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.models.Cliente;

import java.sql.SQLOutput;
import java.util.List;

public class TesteClienteDAO {
    public static void main(String[] args) {

        ClienteDAOImpl clienteDAO = new ClienteDAOImpl();

        Cliente cliente1 = new Cliente("Luis","123");
        Cliente cliente2 = new Cliente("Luis Silva", "123");
        Cliente cliente3 = new Cliente("Andre","456");
        Cliente cliente4 = new Cliente("Mario", "789");

        System.out.println("\n -----Testes ao metodo add()----");

        clienteDAO.add(cliente3);
        clienteDAO.add(cliente4);

        List<Cliente> listaClientes = clienteDAO.getAll();

        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }

        System.out.println("\n --- Teste get() - Nif existente ---");
        Cliente retornoCliente = clienteDAO.get("456");
        System.out.println(retornoCliente);

        System.out.println("\n --- Teste get() - Nif nao existente ----");
        Cliente naoExistente = clienteDAO.get("999");
        System.out.println(naoExistente);

        System.out.println("\n ---- Teste do metodo remove() ----");
        System.out.println("foi removido o cliente andre com o nif 456");
        boolean removerClienteExistente = clienteDAO.remove("456");
        System.out.println("Removeu existente? " + removerClienteExistente);
        System.out.println("\nRemocao de um cliente que nao existe nif 999");
        boolean removerClienteNaoExistente = clienteDAO.remove("999");
        System.out.println("Removeu existente? " + removerClienteNaoExistente);

        listaClientes = clienteDAO.getAll();

        System.out.println("Print dos clientes actuais depois do teste");
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }

        System.out.println("\n ---- Teste Update ----");

        clienteDAO.add(cliente1);
        System.out.println("Antes do update: ");
        System.out.println(clienteDAO.get("123"));

        //2. Atualizar

        boolean atualizado = clienteDAO.update(cliente2, "123");
        System.out.println("\nUpdate realizado? " + atualizado);

        //3.Verificar se mudou
        System.out.println("Depois do update: ");
        System.out.println(clienteDAO.get("123"));

        //4 Teste nif que nao existe.

        System.out.println("\n---- Teste Update - NIF inexistente ----");
        Cliente clienteInexistente = new Cliente("Joao", "999");
        boolean atualizadoFalso = clienteDAO.update(clienteInexistente, "999");
        System.out.println("Update realizado?" + atualizadoFalso);
    }
}
