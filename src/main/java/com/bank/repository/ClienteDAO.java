package com.bank.repository;
import com.bank.models.Cliente;

public class ClienteDAO {

    private static Cliente[] clientes = new Cliente[1];

    private static int totalClientes = 0;

    public void adicionaCliente(Cliente cliente) {

        if(totalClientes >= clientes.length) {

            Cliente[] novoArray = new Cliente[clientes.length + 1];

            for (int i = 0; i < clientes.length; i++) {
                novoArray[i] = clientes[i];
            }

            clientes = novoArray;

        }
        clientes[totalClientes] = cliente;
        totalClientes++;
    }

    public Cliente getClient(String nif) {

        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getNif().equals(nif)) {
                return clientes[i];
            }
        }

        return null;

    }

    public int size() {
        return totalClientes;
    }



    public void remove(String nif) {

        boolean encontrado = false;

        for(int i = 0; i < totalClientes; i++){
            if(clientes[i].getNif().equals(nif)) {
              clientes[i] = null;
              clientes[i] = clientes[totalClientes - 1];
              clientes[totalClientes- 1] = null;
              totalClientes--;
              encontrado = true;
              break;
            }
        }
        if(!encontrado) {
            System.out.println("Esse nif nao existe.");
        }

    }



}
