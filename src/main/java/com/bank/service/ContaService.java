package com.bank.service;

import com.bank.models.Conta;

import java.util.List;

public interface ContaService {
    public void add(Conta conta);
    public Conta get(String numeroConta);
    public boolean remove(String numeroConta);
    public boolean update(Conta conta, String numeroConta);
    public List<Conta> getAll();


}
