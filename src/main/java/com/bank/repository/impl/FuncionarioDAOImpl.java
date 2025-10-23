package com.bank.repository.impl;

import com.bank.models.Funcionario;

public class FuncionarioDAOImpl {

    private static Funcionario[] funcionarios = new Funcionario[100];

    private static int totalFuncionarios = 0;

    public void adicionaFuncionario(Funcionario funcionario) {

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
     * Metodo que procura e retorna um objecto do tipo funcionario atraves do atributo nif
     * @param  nif
     * @return
     * @
     */
    public Funcionario getFuncionario(String nif) {

        for (int i = 0; i < totalFuncionarios; i++) {
            if (funcionarios[i].getNif().equals(nif)) {
                return funcionarios[i];
            }
        }

        return null;
    }

    public int size() {
        return totalFuncionarios;
    }

    /**
     * 
     * @param nif
     * @return
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

}
