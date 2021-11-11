package com.studies;

public class Comissionados extends Funcionarios
{
    double salarioMensal, perctcomissao;
    int totalVendas;

    public Comissionados(double sal, double per, int totalv)
    {
        this.salarioMensal = sal;
        this.perctcomissao = per;
        this.totalVendas = totalv;
    }

    @Override
    public double calcularSalario()
    {
        this.salarioMensal += (this.perctcomissao * this.totalVendas);

        return (this.salarioMensal);
    }

    @Override
    public String toString() {
        return "Comissionados{" +
                "salarioMensal=" + salarioMensal +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
