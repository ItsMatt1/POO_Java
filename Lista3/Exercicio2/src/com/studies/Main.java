package com.studies;

import java.io.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        try
        {

            int j = 0;

            String oi;
            String[] campos;

            //ler

            File file = new File("C:\\Users\\Matheus\\Desktop\\Faculdade\\Terceiro Periodo\\POO\\Lista3\\11-1 - funcionarios.txt");
            Scanner sc = new Scanner(file);

            Funcionario[] teste = new Funcionario[1000];

            sc.useDelimiter("\\Z");

            oi = (sc.next());

            campos = oi.split("#");

            //gravar

            FileOutputStream arquivoGrav = new FileOutputStream("C:\\Users\\Matheus\\Desktop\\Faculdade\\Terceiro Periodo\\POO\\Lista3\\arqGrav.txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);

            int a = campos.length;

            for (int i = 0; i < campos.length; i += 4, j++)
            {
                char c = campos[i+1].charAt(0);

                teste[j] = new Funcionario(campos[i],c,Double.parseDouble(campos[i+2]),Integer.parseInt(campos[i+3]));

                System.out.println(teste[j].mostraFuncionario());

                objGravar.writeObject(teste[j]);
                objGravar.flush();

            }

            System.out.println(a);

            objGravar.close();

            arquivoGrav.flush();
            arquivoGrav.close();
            System.out.println("Objeto gravado com sucesso!");
        }

        catch (Exception e)
        {
            System.out.println("Falha na gravação.");
            e.printStackTrace();
        }

        try
        {
            //Carrega o arquivo
            FileInputStream arquivoLeitura = new FileInputStream("C:\\Users\\Matheus\\Desktop\\Faculdade\\Terceiro Periodo\\POO\\Lista3\\arqGrav.txt");

            // Classe responsável por recuperar os objetos do arquivo
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);

            for (int i = 0; i < 200; i++)
            {
                System.out.println(objLeitura.readObject());
            }

            objLeitura.close();
            arquivoLeitura.close();

            System.out.println("Objeto lido com sucesso!");
        }

        catch (Exception e)
        {
            System.out.println("Falha na leitura.");
            e.printStackTrace();
        }
    }
}

