package com.bank.repository;

import com.bank.models.Cliente;

public interface ClienteDAO {

	public void adicionaCliente(Cliente cliente);

    public Cliente getClient(String nif);

    public void remove(String nif);
}
