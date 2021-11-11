package com.studies;

public abstract class Loja implements Registro
{
    protected String identificador, cnpj, razsocial;
    protected boolean aberta;

    public Loja(String identificador, String cnpj, String razsocial, boolean aberta) {
        this.identificador = identificador;
        this.cnpj = cnpj;
        this.razsocial = razsocial;
        this.aberta = aberta;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazsocial() {
        return razsocial;
    }

    public void setRazsocial(String razsocial) {
        this.razsocial = razsocial;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }


    @Override
    public void registra_abertura_dia()
    {
        if (!this.aberta)
        {
            this.aberta = true;
            System.out.println("Loja " + getIdentificador() + " estava fechada e foi aberta com sucesso!");
        }
        else
        {
            System.out.println("Loja" + getIdentificador() + " já estava aberta");
        }
    }

    @Override
    public void registra_fechamento_dia()
    {
        if (this.aberta)
        {
            this.aberta = false;
            System.out.println("Loja " + getIdentificador() + " estava aberta e foi fechada com sucesso!");
        }
        else
        {
            System.out.println("Loja "+ getIdentificador() + " já estava fechada");
        }
    }
}
