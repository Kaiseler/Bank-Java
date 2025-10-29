package com.bank.repository.impl;

import com.bank.models.ContaPoupanca;
import com.bank.repository.ContaPoupancaDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContaPoupancaDAOImpl implements ContaPoupancaDAO {

    private HashMap<String, ContaPoupanca> contasPoupanca = new HashMap<>();


    /**
     * Adiciona uma ContaPoupanca ao HashMap contasPoupanca.
     * @param conta o objeto ContaPoupanca a ser adicionado.
     */
    public void add(ContaPoupanca conta) {
        contasPoupanca.put(conta.getNumeroConta(), conta);
    }

    /**
     * Procura uma conta poupanca pelo atributo numeroConta.
     * @param numeroConta a String a ser procurada nos objetos do tipo ContaPoupanca.
     * @return o objeto ContaPoupanca que corresponde ao numero de conta, ou null senao existir.
     */
    public ContaPoupanca get(String numeroConta) {
        return contasPoupanca.get(numeroConta);
    }

    /**
     * Procura uma conta a ordem pelo atributo numeroConta, remove essa conta.
     * @param numeroConta a String a ser procurada nos objectos do tipo ContaPoupanca.
     * @return true se o objeto for removido, false senão existir.
     */
    public boolean remove(String numeroConta) {

        ContaPoupanca resultado = contasPoupanca.remove(numeroConta);

        if (resultado != null) {
            return true;
        }
        return false;
    }

    /**
     * Procura uma conta poupanca pelo atributo numeroConta e substitui a mesma.
     * @param contaNova objeto que vai substituir a conta antiga.
     * @param numeroConta a String a ser procurada.
     * @return true se a ContaPoupanca foi atualizada, false senao foi encontrada.
     */
    public boolean update(ContaPoupanca contaNova, String numeroConta) {

        if (contasPoupanca.containsKey(numeroConta)){
            contasPoupanca.put(numeroConta, contaNova);
            return true;
        }
        return false;
    }

    /**
     * Retorna todas as contas no HashMap contas, atraves do metodo values(),
     * o metodo retorna todos os valores das keys em contasPoupanca.
     * @return um ArrayList com os objetos ContaOrdem dentro de contasPoupanca.
     */
    public List<ContaPoupanca> getAll() {
        return new ArrayList<>(contasPoupanca.values());
    }
}
