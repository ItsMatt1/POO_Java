package com.studies;

public class CaixaDeBanco extends DadosFuncionario {
    private String horario;

    //Getters e Setters

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    //Métodos

    public double totalAnual()
    {
        return this.salario;
    }

    public void mostrarInformacao()
    {
        System.out.println("Nome: " + this.nome + " Telefone: " + this.telefone +" - " + this.status);
    }

}
