package com.bank.models;

import java.util.Date;

public class Cliente extends Pessoa {

    private Date dataCadastro;

    public Cliente(String name, String nif, String telefone, String morada, Date dataCadastro) {
        super(name, nif, telefone, morada);
        this.dataCadastro = dataCadastro;
    }

    public Cliente () {
        super();
    }

    public Cliente (String name, String nif) {
        super(name, nif);
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cliente)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Cliente c = (Cliente) obj;

        if(this.getName().equals(c.getName()) && this.getNif() == c.getNif()) {
            return true;
        }

        return false;
    }
}
