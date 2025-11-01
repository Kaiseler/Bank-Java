package com.bank.service;

import com.bank.models.Funcionario;

import java.util.List;

public interface FuncionarioService {
    public void add(Funcionario funcionario);
    public Funcionario get(String nif) throws Exception;
    public boolean remove(String nif);
    public boolean update(Funcionario funcionario, String nif);

    public List<Funcionario> getAll();
}
