package com.studies;

public class Notificacao extends Documentos
{

    public Notificacao(String num, String remetente, String tipo) {
        super(num, remetente, tipo);
    }

    @Override
    public String getDescription() {
        return "Nova notificacao criada!";
    }
}
