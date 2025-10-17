package com.bank.models;

public class Funcionario extends Pessoa {
    private String matricula;
    private String cargo;

    public Funcionario(String name, String nif, String telefone, String morada, String matricula, String cargo) {
        super(name, nif, telefone, morada);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public Funcionario(){
        super();
    }

    public Funcionario(String name, String nif) {
        super(name, nif);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
