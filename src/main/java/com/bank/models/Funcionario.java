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
