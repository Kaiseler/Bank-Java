package com.bank.service.impl;

import com.bank.models.Conta;
import com.bank.repository.ContaDAO;
import com.bank.repository.impl.ContaDAOImpl;
import com.bank.service.ContaService;

import java.util.List;

public class ContaServiceImpl implements ContaService {

    private ContaDAO repository = new ContaDAOImpl();

    private boolean validationNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.length() != 11) {
            throw new RuntimeException("O número de conta está vazio, ou não tem 11 numeros");
        }
        return true;
    }

    private Conta verificationContaExiste(String numeroConta) {
        this.validationNumeroConta(numeroConta);

        Conta contaEncontrada = repository.get(numeroConta);

        if (contaEncontrada == null) {
            throw new RuntimeException("A conta com o numero " + numeroConta + " não foi encontrada!!");
        }

        return contaEncontrada;
    }

    @Override
    public void add(Conta conta) {

        this.validationNumeroConta(conta.getNumeroConta());

        repository.add(conta);
    }

    @Override
    public Conta get(String numeroConta) {

        return this.verificationContaExiste(numeroConta);
    }

    @Override
    public boolean remove(String numeroConta) {

        this.verificationContaExiste(numeroConta);

        return repository.remove(numeroConta);
    }

    @Override
    public boolean update(Conta conta, String numeroConta) {

        this.verificationContaExiste(numeroConta);

        if(numeroConta.equals(conta.getNumeroConta())) {
            return repository.update(conta, numeroConta);
        }
        return false;
    }

    @Override
    public List<Conta> getAll() {
        return repository.getAll();
    }

}
