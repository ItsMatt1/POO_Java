package com.studies;

public abstract class Documentos
{
    String num;
    String remetente;
    String tipo;

    public Documentos(String num, String remetente, String tipo) {
        this.num = num;
        this.remetente = remetente;
        this.tipo = tipo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract String getDescription();
}
