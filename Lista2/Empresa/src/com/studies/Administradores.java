package com.studies;

public class Administradores extends Funcionarios
{
    private double salarioMensal;

    public Administradores(double sal)
    {
        this.salarioMensal = sal;
    }

    @Override
    public double calcularSalario()
    {
        return (this.salarioMensal);
    }

    @Override
    public String toString() {
        return "Administradores{" +
                "salarioMensal=" + salarioMensal +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
