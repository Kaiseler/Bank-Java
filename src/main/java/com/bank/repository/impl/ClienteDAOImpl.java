package com.bank.repository.impl;
import com.bank.models.Cliente;
import com.bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    private static Cliente[] clientes = new Cliente[1];

    private static int totalClientes = 0;

    /**
     * Adiciona um Cliente ao array clientes na posição totalClientes (primeira posicao vazia);
     * Incrementa a variável totalClientes. Se o array estiver cheio, cria um novo array
     * com mais uma posição, copia todos os elementos, e substitui o array antigo.
     * @param cliente o objecto Cliente a ser adicionado
     */
    public void add(Cliente cliente) {

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

    /**
     * Procura um cliente pelo atributo nif. percorre o array ate a variavel totalClientes.
     * @param nif a String a ser procurada nos objectos de tipo Cliente
     * @return o objecto Cliente correspondente ao nif, ou null se não for encontrada.
     */

    public Cliente get(String nif) {

        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getNif().equals(nif)) {
                return clientes[i];
            }
        }

        return null;

    }

    /**
     * Remove um cliente pelo atributo nif. Percorre o array até totalClientes,
     * e se encontrar o cliente, remove-o e reorganiza o array movendo os elementos
     * seguintes uma posição para trás. Decrementa totalClientes.
     *
     * @param nif a String a ser procurada nos objectos do tipo Cliente
     * @return true se o cliente foi removido, false se não foi encontrado
     */

    public boolean remove(String nif) {

        for(int i = 0; i < totalClientes; i++){
            if(clientes[i].getNif().equals(nif)) {
              clientes[i] = null;
              clientes[i] = clientes[totalClientes - 1];
              clientes[totalClientes- 1] = null;
              totalClientes--;
              return true;
            }
        }
        return false;

    }

    /**
     * Atualiza um cliente existente no array. Percorre o array até totalClientes,
     * procura pelo nif, e se encontrar, substitui o cliente antigo pelo novo cliente recebido.
     *
     * @param cliente o objecto Cliente com os novos valores
     * @param nif a String do nif a ser procurado
     * @return true se o cliente foi atualizado, false se não foi encontrado
     */

    public boolean update(Cliente cliente, String nif) {

        for (int i = 0; i < totalClientes; i++) {

            if (clientes[i].getNif().equals(nif)) {
                clientes[i] = cliente;
                return true;
            }

        }
        return false;
    }

    /**
     * Retorna todos os clientes do array. Percorre o array até totalClientes
     * e adiciona cada cliente a uma nova lista.
     *
     * @return uma List com todos os clientes, ou uma lista vazia se não houver clientes
     */

    public List<Cliente> getAll() {
        List<Cliente> allClients = new ArrayList<>();

        for (int i = 0; i < totalClientes; i++) {
            allClients.add(clientes[i]);
        }
        return allClients;
    }

    private int size() {
        return totalClientes;
    }

}
