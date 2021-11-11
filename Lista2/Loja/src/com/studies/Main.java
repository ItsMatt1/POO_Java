package com.studies;

public class Main {

    public static void main(String[] args)
    {
        Loja matriz = new LojaConcreta("0","39993","Data norte",false,"rua c 136","Marcos");

        Loja[] filiais = new LojaConcreta[2];
        filiais[0] = new LojaConcreta("1","39994","Data sul",false,"rua c 125","Felícia");
        filiais[1] = new LojaConcreta("2","39995","Data leste",false,"rua c 123","João");

        System.out.println(matriz);
        System.out.println(filiais[0]);
        System.out.println(filiais[1]);

        matriz.registra_fechamento_dia();
        matriz.registra_fechamento_dia();
        matriz.registra_abertura_dia();

        filiais[0].registra_fechamento_dia();
        filiais[0].registra_abertura_dia();

        filiais[1].registra_abertura_dia();
        filiais[1].registra_fechamento_dia();

        matriz.registra_fechamento_dia();

    }
}
