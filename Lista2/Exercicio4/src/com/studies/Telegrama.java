package com.studies;

public class Telegrama extends Documentos
{
    public Telegrama(String num, String remetente, String tipo) {
        super(num, remetente, tipo);
    }

    @Override
    public String getDescription() {
        return "Novo telegrama criado!";
    }
}
