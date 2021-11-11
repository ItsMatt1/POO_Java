package com.studies;

import java.util.Scanner;

public class Aparelho extends Cliente
{
    private String codigo;
    private int ano;
    private String marca;
    private String modelo;
    private int i;

    private Cliente proprietario;

    private Atendimento atendimentos;


    public Aparelho(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    public Atendimento getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(Atendimento atendimentos) {
        this.atendimentos = atendimentos;
    }

}
