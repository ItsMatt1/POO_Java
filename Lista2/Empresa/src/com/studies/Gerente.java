package com.studies;

public class Gerente extends Funcionarios
{
    double salarioMensal, bonificacao, salTotal;

    public Gerente(double sal, double bon)
    {
        this.salarioMensal = sal;
        this.bonificacao = bon;
    }

    @Override
    public double calcularSalario()
    {
        this.salTotal = this.salarioMensal + this.bonificacao;

        return (this.salTotal);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salTotal=" + salTotal +
                '}';
    }
}
