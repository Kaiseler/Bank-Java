package com.bank.repository.impl;

import com.bank.models.Conta;
import com.bank.models.ContaOrdem;
import com.bank.models.ContaPoupanca;
import com.bank.repository.ContaOrdemDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContaOrdemDAOImpl implements ContaOrdemDAO {

    private HashMap<String, ContaOrdem> contas = new HashMap<>();

    /**
     * Adiciona uma ContaOrdem ao HashMap contas.
     * @param conta o objecto ContaOrdem a ser adicionado.
     */

    public void add(ContaOrdem conta) {
        contas.put(conta.getNumeroConta(), conta);

    }

    /**
     * Procura uma conta a ordem pelo atributo numeroConta.
     * @param numeroConta a String a ser procurada nos objectos do tipo ContaOrdem
     * @return o objecto ContaOrdem que corresponde ao numero de conta, ou null senao existir.
     */
    public ContaOrdem get(String numeroConta) {
        return contas.get(numeroConta);
    }

    /**
     * Procura uma conta a ordem pelo atributo numeroConta e remove a mesma.
     * @param numeroConta a String a ser procurada nos objectos do tipo ContaOrdem
     * @return true se objeto for removido, false senão existir.
     */
    public boolean remove(String numeroConta) {

        ContaOrdem resultado = contas.remove(numeroConta);

        if (resultado != null) {
            return true;
        }
        return false;
    }

    /**
     * Atualiza um cliente existente no HashMap contas, recebe um objecto com os
     * dados para atualizar, procura pelo numeroConta, se encontrar, substitui a conta
     * velha pela conta nova.
     * @param conta o objecto ContaOrdem com os novos valores.
     * @param numeroConta a String para ser procurada.
     * @return true se a ContaOrdem foi atualizada, false senao foi encontrada.
     */

    public boolean update(ContaOrdem conta, String numeroConta) {

        if (contas.containsKey(numeroConta)) {
            contas.put(numeroConta, conta);
            return true;
        }
        return false;
    }

    /**
     * Retorna todas as contas no HashMap contas, atraves do metodo values(),
     * o metodo retorna todos os valores das keys em contas.
     * @return um ArrayList com os objetos ContaOrdem dentro de contas.
     */
    public List<ContaOrdem> getAll() {

        return new ArrayList<>(contas.values());
    }
}
