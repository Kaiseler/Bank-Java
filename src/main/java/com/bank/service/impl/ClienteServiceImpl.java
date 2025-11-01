package com.bank.service.impl;


import com.bank.models.Cliente;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.service.ClienteService;

import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO repository = new ClienteDAOImpl();

    private boolean validationNif(String nif) {
        if (nif == null || nif.length() != 9 )  {
            throw new RuntimeException("O nif está vazio, ou não tem 9 digitos");

        }
        return true;
    }

    @Override
    public void add(Cliente cliente) {
        this.validationNif(cliente.getNif());
        repository.add(cliente);
    }

    @Override
    public Cliente get(String nif) {
        this.validationNif(nif);

        Cliente clienteEncontrado = repository.get(nif);

        if (clienteEncontrado == null) {
            throw new RuntimeException("Esse Cliente não existe");
        }

        return clienteEncontrado;
    }

    @Override
    public boolean remove(String nif) {
        this.validationNif(nif);
        return repository.remove(nif);
    }

    @Override
    public boolean update(Cliente cliente, String nif) {
        this.validationNif(nif);
        if (nif.equals(cliente.getNif())){

            return repository.update(cliente, nif);
        }

        return false;
    }

    @Override
    public List<Cliente> getAll() {
        return repository.getAll();
    }
}
