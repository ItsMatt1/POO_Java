package com.studies;

public class Carta extends Documentos
{

    public Carta(String num, String remetente, String tipo) {
        super(num, remetente, tipo);
    }

    @Override
    public String getDescription() {
        return "Nova carta criada!";
    }
}
