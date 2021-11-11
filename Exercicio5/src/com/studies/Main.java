package com.studies;

public class Main {

    public static void main(String[] args)
    {
	    CaixaDeBanco caixa = new CaixaDeBanco();

	    caixa.setNome("Lucas");
	    caixa.setHorario("8h");
	    caixa.setTelefone("32936655");
	    caixa.setSalario(5000);
	    caixa.atualizarSalario(10);

	    Gerente manager = new Gerente();

		caixa.setNome("Matheus");
	    manager.setTelefone("32889923");
	    manager.setSalario(7000);
	    manager.setBonificacao(200);
	    manager.setTipo("PF");
	    manager.atualizarSalario(20);

		//mostrarDadosCaixadeBanco();
		//mostrarDadosGerente();

	    Cliente client1 = new Cliente();
        Cliente client2 = new Cliente();
        Cliente client3 = new Cliente();

        client1.setNome("Bia");
		client1.setCPF("07761598328");
		client1.setIdade(32);
		client1.setStatus("A");
		client1.setTelefone("32336915");

		client2.setNome("Aleh");
		client2.setCPF("0672598333");
		client2.setIdade(16);
		client2.setStatus("I");
		client2.setTelefone("32338799");

		client3.setNome("Pedro");
		client3.setCPF("0784569338");
		client3.setIdade(20);
		client3.setStatus("A");
		client3.setTelefone("32446944");


        client2.desativar();
        client1.mostrarInformacao();
        client2.mostrarInformacao();
        client3.mostrarInformacao();
    }
}
