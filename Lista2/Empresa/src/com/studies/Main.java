package com.studies;

public class Main {

    public static void main(String[] args) {
        Funcionarios[] trabs = new Funcionarios[10];

        trabs[0] = new Gerente(5000, 300);
        trabs[1] = new Administradores(2500);
        trabs[2] = new Administradores(2500);
        trabs[3] = new Administradores(2600);
        trabs[4] = new Administradores(2500);
        trabs[5] = new Horistas(5, 250);
        trabs[6] = new Horistas(6, 250);
        trabs[7] = new Comissionados(1500, 4, 50);
        trabs[8] = new Comissionados(1500, 4, 25);
        trabs[9] = new Comissionados(1500, 4, 51);

        //Gerente

        trabs[0].setNome("Michael");
        trabs[0].setSobrenome("Scott");
        trabs[0].calcularSalario();

        //Administradores

        trabs[1].setNome("Jim");
        trabs[1].setSobrenome("Halpert");
        trabs[1].calcularSalario();

        trabs[2].setNome("Pam");
        trabs[2].setSobrenome("Beesly");
        trabs[2].calcularSalario();

        trabs[3].setNome("Dwight");
        trabs[3].setSobrenome("Schrute");
        trabs[3].calcularSalario();

        trabs[4].setNome("Angela");
        trabs[4].setSobrenome("Martin");
        trabs[4].calcularSalario();


        //Horistas
        trabs[5].setNome("Ryan");
        trabs[5].setSobrenome("Howard");
        trabs[5].calcularSalario();

        trabs[6].setNome("Kelly");
        trabs[6].setSobrenome("Kapoor");
        trabs[6].calcularSalario();

        //Comissionados

        trabs[7].setNome("Stanley");
        trabs[7].setSobrenome("Hudson");
        trabs[7].calcularSalario();

        trabs[8].setNome("Darryl");
        trabs[8].setSobrenome("Philbin");
        trabs[8].calcularSalario();

        trabs[9].setNome("Oscar");
        trabs[9].setSobrenome("Martinez");
        trabs[9].calcularSalario();

        for (int i = 0; i < 10; i++) {
            System.out.println(trabs[i]);
        }

    }
}
