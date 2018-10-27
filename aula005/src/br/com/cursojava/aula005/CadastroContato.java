package br.com.cursojava.aula005;

import java.util.Scanner;

public class CadastroContato {

	ContatoController controller = new ContatoController();

	public void mostrarMenu(Scanner scanner) {
		String opcao;
		do {
			System.out.println();
			System.out.println("#-------------------#");
			System.out.println("|   Menu principal  |");
			System.out.println("#-------------------#");
			System.out.println("|1 - Novo Contato   |");
			System.out.println("|2 - Listar Contatos|");
			System.out.println("|3 - Sair           |");
			System.out.println("#-------------------#");

			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextLine();
			tratarOpcao(opcao, scanner);
		} while (!"3".equals(opcao));
	}

	private void tratarOpcao(String opcao, Scanner scanner) {
		switch (opcao) {
		case "1":
			cadastrarContato(scanner);
			break;

		case "2":
			listarContatos();
			break;

		case "3":
			sair();
			break;

		default:
			mostrarOpcaoInvalida(opcao);
		}
	}

	private void cadastrarContato(Scanner scanner) {
		System.out.println("####  Novo Contato  ####");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		System.out.print("e-mail: ");
		String email = scanner.nextLine();

		System.out.print("Telefone: ");
		String telefone = scanner.nextLine();

		controller.criarContato(nome, email, telefone);
	}

	private void listarContatos() {
		System.out.println("####  Listar Contatos  ####");

		Contato contato;
		int quantidade = controller.totalContatos();

		if (quantidade == 0) {
			System.out.println("Não existem contatos cadastrados");
		} else {
			for (int i = 0; i < quantidade; i++) {
				contato = controller.buscarContato(i);
				System.out.printf("%s - %s - %s\n", contato.getNome(), contato.getEmail(), contato.getTelefone());
			}
		}
	}

	private void sair() {
		System.out.println("Obrigado por utilizar nosso sistema");
	}

	private void mostrarOpcaoInvalida(String opcao) {
		System.out.printf("Opção inválida ('%s')!\n", opcao);
	}

}