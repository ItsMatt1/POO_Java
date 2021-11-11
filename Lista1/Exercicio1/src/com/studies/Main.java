package com.studies;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int qtd;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de Moradores: ");
        qtd = sc.nextInt();

        Moradores[] vetor = new Moradores[qtd];

        for (int i = 0; i < qtd; i++)
        {
            Moradores ins = new Moradores();
            vetor[i] = ins;

            if (i == 0)
            {
                System.out.println("Digite o nome do Morador: ");
                 ins.setNome(sc.next());
            }

            else
            {
                System.out.println("Digite o nome do proximo Morador: ");
                 ins.setNome(sc.next());
            }

            System.out.println("Digite o CPF do Morador: ");
            ins.setCPF(sc.next());

            System.out.println("Digite o cell do Morador: ");
            ins.setCell(sc.next());

            System.out.println("Digite a data de nascimento do Morador: ");
            ins.setDataNascimento(sc.next());

            System.out.println("Digite o sexo do Morador: ");
            ins.setSexo(sc.next());

            System.out.println("Digite o bloco do Morador: ");
            ins.setBloco(sc.next());

            System.out.println("Digite o apartamento do Morador: ");
            ins.setAp(sc.next());

            System.out.println("Digite o Código de acesso do Morador: ");
            ins.setCode(sc.next());

        }

        for (int i = 0; i < qtd; i++)
        {
            System.out.println("Dados do morador: " + i);
            System.out.println("Nome: " + vetor[i].getNome());
            System.out.println("CPF: " + vetor[i].getCPF());
            System.out.println("Cell: " + vetor[i].getCell());
            System.out.println("Data de nascimento: " + vetor[i].getDataNascimento());
            System.out.println("Sexo: " + vetor[i].getSexo());
            System.out.println("Bloco: " + vetor[i].getBloco());
            System.out.println("Apartamento: " + vetor[i].getAp());
            System.out.println("Código de acesso: " + vetor[i].getCode());
            System.out.println("Código sequencial: " + Moradores.codigoSequencial + "\n");

        }
        sc.close();
    }
}