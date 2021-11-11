package com.studies;

public class Cliente {
    private String nome, telefone, status, CPF;
    private int idade;

    //Getters e Setters

    Cliente()
    {
        this.status = "ativo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void desativar()
    {
        if (this.status.equals("ativo"))
        {
            this.status = "desativo";
        }
    }


    public void mostrarInformacao()
    {
        System.out.println("Nome: " + this.nome + " Telefone: " + this.telefone + " Idade: " + this.idade + " anos" + " cpf: " + this.CPF + " - " + this.status);
    }


}
