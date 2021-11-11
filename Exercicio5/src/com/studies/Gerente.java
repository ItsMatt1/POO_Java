package com.studies;

public class Gerente extends DadosFuncionario {
    private String tipo;
    private double bonificacao;

    //Getters e Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(int bonificacao) {
        this.bonificacao = bonificacao;
    }

    //Métodos

    public double totalAnual()
    {
        return (this.salario * 12) + (bonificacao * 12);
    }


}
