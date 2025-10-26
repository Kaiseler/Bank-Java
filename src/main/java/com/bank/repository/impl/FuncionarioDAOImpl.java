package com.bank.repository.impl;

import com.bank.models.Funcionario;
import com.bank.repository.FuncionarioDAO;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    private static Funcionario[] funcionarios = new Funcionario[100];

    private static int totalFuncionarios = 0;

    /**
     * Adiciona um Funcionario ao array funcionarios na posição totalFuncionarios (primeira posicao vazia);
     * Incrementa a variável totalFuncionarios. Se o array estiver cheio, cria um novo array
     * com mais uma posição, copia todos os elementos, e substitui o array antigo.
     * @param funcionario o objecto Funcionario a ser adicionado
     */
    public void add(Funcionario funcionario) {

        if (totalFuncionarios >= funcionarios.length) {

            Funcionario[] novoArray = new Funcionario[funcionarios.length + 1];

            for (int i = 0; i < funcionarios.length; i++) {
                novoArray[i] = funcionarios[i];
            }

            funcionarios = novoArray;
        }
        funcionarios[totalFuncionarios] = funcionario;
        totalFuncionarios++;
    }

    /**
     * Procura um funcionario pelo atributo nif. percorre o array ate a variavel totalFuncionarios.
     * @param nif a String a ser procurada nos objectos de tipo Funcionario
     * @return o objecto Funcionario correspondente ao nif, ou null se não for encontrada.
     */

    public Funcionario get(String nif) {

        for (int i = 0; i < totalFuncionarios; i++) {
            if (funcionarios[i].getNif().equals(nif)) {
                return funcionarios[i];
            }
        }

        return null;
    }



    /**
     * Remove um funcionario pelo atributo nif. Percorre o array até totalFuncionarios,
     * e se encontrar o funcionario, substitui-o pelo último elemento do array e
     * decrementa totalFuncionarios.
     *
     * @param nif a String a ser procurada nos objectos do tipo Funcionario
     * @return true se o funcionario foi removido, false se não foi encontrado
     */
    public boolean remove(String nif) {

        for (int i = 0; i < totalFuncionarios; i++) {
            if (funcionarios[i].getNif().equals(nif)) {
                funcionarios[i] = null;
                funcionarios[i] = funcionarios[totalFuncionarios - 1];
                funcionarios[totalFuncionarios - 1] = null;
                totalFuncionarios--;
                return true;
            }
        }
        return false;

    }

    /**
     * Atualiza um cliente existente no array. Percorre o array até totalFuncionarios,
     * procura pelo nif, e se encontrar, substitui o cliente antigo pelo novo cliente recebido.
     *
     * @param funcionario o objecto Funcionario com os novos valores
     * @param nif a String do nif a ser procurado
     * @return true se o funcionario foi atualizado, false se não foi encontrado
     */
    public boolean update(Funcionario funcionario, String nif) {

        for (int i = 0; i < totalFuncionarios; i++) {

            if (funcionarios[i].getNif().equals(nif)) {
                funcionarios[i] = funcionario;
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna todos os funcionarios do array. Percorre o array até totalFuncionarios
     * e adiciona cada funcionario a uma nova lista.
     *
     * @return uma List com todos os funcionarios, ou uma lista vazia se não houver funcionarios.
     */

    public List<Funcionario> getAll() {
        List<Funcionario> allFuncionarios = new ArrayList<>();

        for (int i = 0; i < totalFuncionarios; i++) {
            allFuncionarios.add(funcionarios[i]);
        }
        return allFuncionarios;
    }

    public int size() {
        return totalFuncionarios;
    }
}
