package com.bank.repository;

import com.bank.models.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, String> {

    public boolean remove(String nif);
}
// Falta fazer o update e getAlL
// Criar mais uma interface tipo generics que funciona com este crud.