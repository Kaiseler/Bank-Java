package com.bank.models;

public abstract class Pessoa {
        private String name;
        private String nif;

        private String telefone;
        private String morada;

    public Pessoa(String name, String nif, String telefone, String morada) {
        this.name = name;
        this.nif = nif;
        this.telefone = telefone;
        this.morada = morada;
    }

    public Pessoa() {

    }

    public Pessoa(String name, String nif) {
        this.name = name;
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }



    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public String toString() {
        return  "Nome: " + this.name +
                "NIF: " + this.nif +
                "Telefone: " + this.telefone +
                "Morada: " + this.telefone;


    }
}
