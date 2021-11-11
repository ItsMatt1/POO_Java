package com.studies;

import java.util.Date;

public class Atendimento extends Funcionario
{
    private Date data;
    private String descricao;

    private Funcionario atendente;

    private Aparelho aparelho;

    public Atendimento(String nome, String cpf, int matricula) {
        super(nome, cpf, matricula);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }

    public Aparelho getAparelho() {
        return aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }
}
