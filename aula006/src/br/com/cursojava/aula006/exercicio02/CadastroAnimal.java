package br.com.cursojava.aula006.exercicio02;

import java.util.Scanner;

public class CadastroAnimal {

	AnimalController controller = new AnimalController();

	public void mostrarMenu(Scanner scanner) {
		String opcao;
		do {
			System.out.println();
			System.out.println("#-----------------------#");
			System.out.println("|     Menu principal    |");
			System.out.println("#-----------------------#");
			System.out.println("|1 - Cadastrar cachorro |");
			System.out.println("|2 - Cadastrar gato     |");
			System.out.println("|3 - Listar animais     |");
			System.out.println("|4 - Sair               |");
			System.out.println("#-----------------------#");

			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextLine();
			tratarOpcao(opcao, scanner);
		} while (!"4".equals(opcao));
	}

	private void tratarOpcao(String opcao, Scanner scanner) {
		switch (opcao) {
		case "1":
			cadastrarCachorro(scanner);
			break;

		case "2":
			cadastrarGato(scanner);
			break;

		case "3":
			listarAnimais();
			break;

		case "4":
			sair();
			break;

		default:
			mostrarOpcaoInvalida(opcao);
		}
	}

	private void cadastrarCachorro(Scanner scanner) {
		System.out.println("####  Cadastrar Cachorro  ####");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		controller.criarCachorro(nome, idade);
	}

	private void cadastrarGato(Scanner scanner) {
		System.out.println("####  Cadastrar Gato  ####");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		controller.criarGato(nome, idade);
	}

	private void listarAnimais() {
		System.out.println("####  Listar Animais  ####");

		int count = controller.getCount();
		if (count == 0) {
			System.out.println("Não existem animais cadastrados");
		} else {
			Animal a;
			for (int i = 0; i < count; i++) {
				a = controller.get(i);
				if (i > 0) {
					System.out.println();
				}
				System.out.printf("Animal %d: %s\n", i + 1, a.getNome());
				a.correr();
				a.comer("ração");
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
