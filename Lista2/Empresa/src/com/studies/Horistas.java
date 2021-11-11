package com.studies;

public class Horistas extends Funcionarios
{
    double valorHora;
    int qntHoras;

    public Horistas(int qntHrs, double valorHr)
    {
        this.qntHoras = qntHrs;
        this.valorHora = valorHr;
    }

    @Override
    public double calcularSalario()
    {
        this.salario = qntHoras * valorHora;

        return (this.salario);
    }

    @Override
    public String toString() {
        return "Horistas{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                ", valor por hora=" + valorHora +
                ", quantidade de horas=" + qntHoras +
                '}';
    }
}
