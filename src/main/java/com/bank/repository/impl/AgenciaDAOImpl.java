package com.bank.repository.impl;

import com.bank.models.Agencia;
import com.bank.repository.AgenciaDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgenciaDAOImpl implements AgenciaDAO {

    private Map<String, Agencia> agenciasDB = new HashMap<>();


    /**
     * Adiciona uma Agencia ao HashMap agenciasDB.
     * @param agencia o objeto Agencia a ser adicionado.
     */
    public void add(Agencia agencia) {
        agenciasDB.put(agencia.getCodigo(), agencia);
    }

    /**
     * Procura uma agencia pelo atributo codigoAgencia.
     * @param codigoAgencia a String a ser procurada nos objectos Agencia.
     * @return o objeto Agencia que corresponde ao numero de codigo de agencia, ou null senao existir.
     */
    public Agencia get(String codigoAgencia) {
        return agenciasDB.get(codigoAgencia);
    }

    /**
     * Procura uma agencia pelo atributo codigoAgencia, remove essa Agencia.
     * @param codigoAgencia a String a ser procurada nos objectos do tipo Agencia.
     * @return true se o objeto for removido, false senão existir.
     */
    public boolean remove(String codigoAgencia) {

        Agencia agenciaEscolhida = agenciasDB.remove(codigoAgencia);

        if (agenciaEscolhida != null) {
            return  true;
        }
        return false;
    }
    /**
     * Procura uma Agencia  pelo atributo codigoAgencia e substitui a mesma.
     * @param agenciaNova objeto que vai substituir a Agencia antiga.
     * @param codigoAgencia a String a ser procurada.
     * @return true se a Agencia foi atualizada, false senao foi encontrada.
     */
    public boolean update(Agencia agenciaNova, String codigoAgencia){

        if(agenciasDB.containsKey(codigoAgencia)) {
            agenciasDB.put(codigoAgencia, agenciaNova);
            return true;
        }
        return false;
    }

    /**
     * Retorna todas as agencias no HashMap agenciasDB, atraves do metodo values(),
     * o metodo retorna todos os valores das keys em contasPoupanca.
     * @return um ArrayList com os objetos Agencia dentro de agenciasDB.
     */
    public List<Agencia> getAll() {
        return new ArrayList<>(agenciasDB.values());
    }

}
