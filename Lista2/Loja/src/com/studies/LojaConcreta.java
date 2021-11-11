package com.studies;

public class LojaConcreta extends Loja
{
    protected String endereco, gerente;

    public LojaConcreta(String identificador, String cnpj, String razsocial, boolean aberta, String endereco, String gerente) {
        super(identificador, cnpj, razsocial, aberta);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "Identificador='" + identificador + '\'' +
                ", CNPJ='" + cnpj + '\'' +
                ", Razão Social='" + razsocial + '\'' +
                ", Status=" + aberta +
                ", Endereço='" + endereco + '\'' +
                ", Gerente='" + gerente + '\'' +
                '}';
    }
}
