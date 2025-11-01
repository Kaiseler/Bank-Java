package com.bank.models;

public class Agencia {
    private String nome;
    private String codigo;
    private String morada;
    private String telefone;

    public Agencia(String nome, String codigo, String morada, String telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.morada = morada;
        this.telefone = telefone;
    }

    public Agencia(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nCodigo: " + this.codigo +
                "\nMorada: " + this.morada +
                "\nTelefone: " + this.telefone;
     }

     @Override
     public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Agencia)) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        Agencia ag = (Agencia) obj;

        if(this.codigo.equals(ag.codigo)) {
            return true;
        }
        return false;
     }
}
