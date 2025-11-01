package com.bank.service.impl;

import com.bank.models.Funcionario;
import com.bank.repository.FuncionarioDAO;
import com.bank.repository.impl.FuncionarioDAOImpl;
import com.bank.service.FuncionarioService;

import java.util.List;

public class FuncionarioServiceImpl implements FuncionarioService {
    private FuncionarioDAO repository = new FuncionarioDAOImpl();

    private boolean validationNif(String nif) {
        if (nif == null || nif.length() != 9) {
            throw new RuntimeException("O nif está vazio, ou não tem 9 digitos");
        }
        return true;
    }

    @Override
    public void add(Funcionario funcionario) {
        this.validationNif(funcionario.getNif());
        repository.add(funcionario);
    }

    @Override
    public Funcionario get(String nif) {
        this.validationNif(nif);

        Funcionario funcionarioEncontrado = repository.get(nif);

        if (funcionarioEncontrado == null) {
            throw new RuntimeException("Esse Cliente não existe");
        }

        return funcionarioEncontrado;
    }

    @Override
    public boolean remove(String nif) {
        this.validationNif(nif);
        return repository.remove(nif);
    }

    @Override
    public boolean update(Funcionario funcionario, String nif) {
        this.validationNif(nif);
        if (nif.equals(funcionario.getNif())){

            return repository.update(funcionario, nif);
        }

        return false;
    }

    @Override
    public List<Funcionario> getAll() {
        return repository.getAll();
    }
}
}
