package com.bank.repository.impl;

import com.bank.models.Conta;
import com.bank.models.ContaPoupanca;
import com.bank.repository.ContaDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContaDAOImpl implements ContaDAO {

    private static Map<String, Conta> contasDB = new HashMap<>();


    /**
     * Adiciona uma ContaPoupanca ao HashMap contasDB.
     * @param conta o objeto ContaPoupanca a ser adicionado.
     */
    public void add(Conta conta) {
        contasDB.put(conta.getNumeroConta(), conta);
    }

    /**
     * Procura uma conta poupanca pelo atributo numeroConta.
     * @param numeroConta a String a ser procurada nos objetos do tipo ContaPoupanca.
     * @return o objeto ContaPoupanca que corresponde ao numero de conta, ou null senao existir.
     */
    public Conta get(String numeroConta) {
        return contasDB.get(numeroConta);
    }

    /**
     * Procura uma conta a ordem pelo atributo numeroConta, remove essa conta.
     * @param numeroConta a String a ser procurada nos objectos do tipo ContaPoupanca.
     * @return true se o objeto for removido, false senão existir.
     */
    public boolean remove(String numeroConta) {

        Conta resultado = contasDB.remove(numeroConta);

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
    public boolean update(Conta contaNova, String numeroConta) {

        if (contasDB.containsKey(numeroConta)){
            contasDB.put(numeroConta, contaNova);
            return true;
        }
        return false;
    }

    /**
     * Retorna todas as contas no HashMap contas, atraves do metodo values(),
     * o metodo retorna todos os valores das keys em contasPoupanca.
     * @return um ArrayList com os objetos ContaOrdem dentro de contasPoupanca.
     */
    public List<Conta> getAll() {
        return new ArrayList<>(contasDB.values());
    }
}
