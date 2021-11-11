package com.studies;

public class Pessoa
{
    String nome;
    double salario, imposto;
    int numDeDependentes, idade;

    public Pessoa(String nome, double salario, int numDeDependentes, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.numDeDependentes = numDeDependentes;
        this.idade = idade;
    }

    public double calculaImposto()
    {
        if (this.idade < 65)
        {

            if (this.salario <= 1787.77)
            {
                return 0;
            }
            else if (this.salario >= 1787.78 && this.salario <= 2679.29)
            {
                this.imposto = ((this.salario * (7.5 / 100)) - 134.08);

                this.imposto = this.imposto - (this.numDeDependentes * 179.71);

                if (this.imposto < 0)
                {
                    this.imposto = 0;
                    return this.imposto;
                }
                return this.imposto;
            }

            else if (this.salario >= 2679.30 && this.salario <= 3572.43)
            {
                this.imposto = ((this.salario * (15.0 / 100)) - 335.03);

                this.imposto = this.imposto - (this.numDeDependentes * 179.71);

                if (this.imposto < 0)
                {
                    this.imposto = 0;
                    return this.imposto;
                }
                return this.imposto;
            }
            else if (this.salario >= 3572.44 && this.salario <= 4463.81)
            {
                this.imposto = ((this.salario * (22.5 / 100)) - 602.96);

                this.imposto = this.imposto - (this.numDeDependentes * 179.71);

                if (this.imposto < 0)
                {
                    this.imposto = 0;
                    return this.imposto;
                }
                return this.imposto;
            }
            else if (this.salario > 4463.81)
            {
                this.imposto = ((this.salario * (27.5 / 100)) - 826.15);

                this.imposto = this.imposto - (this.numDeDependentes * 179.71);

                if (this.imposto < 0)
                {
                    this.imposto = 0;
                    return this.imposto;
                }
                return this.imposto;
            }
        }
        else
        {
            this.imposto = 0;
            return this.imposto;
        }

        return 0;
    }
}
