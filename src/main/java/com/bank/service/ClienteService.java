package com.bank.service;

import com.bank.models.Cliente;

import java.util.List;

public interface ClienteService {
    public void add(Cliente cliente);
    public Cliente get(String nif) throws Exception;
    public boolean remove(String nif);
    public boolean update(Cliente cliente, String nif);

    public List<Cliente> getAll();
}
