package com.studies;

import java.util.Objects;

public class FabricaDocumentos
{
    public static Documentos criarDocumento(String tipo, String remetente, String numero)
    {
        if (Objects.equals(tipo, "Carta"))
            return new Carta(numero, remetente, tipo);
        else if (Objects.equals(tipo,"Notificacao"))
            return new Notificacao(numero, remetente, tipo);
        else if (Objects.equals(tipo,"Telegrama"))
            return new Telegrama(numero, remetente, tipo);

            return null;
    }
}
