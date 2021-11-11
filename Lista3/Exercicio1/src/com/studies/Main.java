package com.studies;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception
    {
        int j = 0;

        String oi;
        String[] campos;

        File file = new File("C:\\Users\\Matheus\\Desktop\\Faculdade\\Terceiro Periodo\\POO\\Lista3\\11-1 - funcionarios.txt");
        Scanner sc = new Scanner(file);

        Funcionario[] teste = new Funcionario[1000];

        sc.useDelimiter("\\Z");

        oi = (sc.next());

        campos = oi.split("#");

        for (int i = 0; i < campos.length; i += 4, j++)
        {
            char c = campos[i+1].charAt(0);

            teste[j] = new Funcionario(campos[i],c,Double.parseDouble(campos[i+2]),Integer.parseInt(campos[i+3]));

            System.out.println(teste[j].mostraFuncionario());

        }
    }
}
