package com.studies;

public class Cliente extends Pessoa
{
    protected String telefone;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
