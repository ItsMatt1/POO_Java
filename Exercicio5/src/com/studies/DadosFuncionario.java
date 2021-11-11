package com.studies;

public class DadosFuncionario {
    protected String nome, telefone, matricula, status, cley;
    protected double salario;

    DadosFuncionario()
    {
        this.status = "ativo";
    }

    //Getters e Setters

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos

    public double atualizarSalario(double percent)
    {
        this.salario += this.salario * percent;

        return this.salario;
    }

    public String getCley() {
        return cley;
    }

    public void setCley(String cley) {
        this.cley = cley;
    }


}

