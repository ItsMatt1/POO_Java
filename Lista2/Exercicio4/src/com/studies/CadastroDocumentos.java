package com.studies;

public class CadastroDocumentos {

    public static void main(String[] args)
    {
        Documentos doc1 = FabricaDocumentos.criarDocumento("Carta", "Matheus","35");
        assert doc1 != null;
        System.out.println(doc1.getDescription());

        Documentos doc2 = FabricaDocumentos.criarDocumento("Notificacao", "Alessandra","13");
        assert doc2 != null;
        System.out.println(doc2.getDescription());

        Documentos doc3 = FabricaDocumentos.criarDocumento("Telegrama", "Jonas","1515");
        assert doc3 != null;
        System.out.println(doc3.getDescription());

    }
}
