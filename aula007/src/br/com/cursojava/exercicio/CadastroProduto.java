package br.com.cursojava.exercicio;

import java.util.Scanner;

public class CadastroProduto {
	
	private ProdutoController controller;
	
	public CadastroProduto() {
		controller = new ProdutoController();
	}

	public void mostrarMenu(Scanner scanner) {
		String opcao;
		do {
			System.out.println();
			System.out.println("#-----------------------#");
			System.out.println("|     Menu principal    |");
			System.out.println("#-----------------------#");
			System.out.println("|1 - Cadastrar produto  |");
			System.out.println("|2 - Listar produtos    |");
			System.out.println("|3 - Remover produto    |");
			System.out.println("|4 - Sair               |");
			System.out.println("#-----------------------#");

			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextLine();
			tratarOpcao(opcao, scanner);
		} while (!"4".equals(opcao));
	}

	private void tratarOpcao(String opcao, Scanner scanner) {
		switch (opcao) {
		case "1": cadastrarProduto(scanner); break;
		case "2": listarProdutos(); break;
		case "3": removerProduto(scanner); break;
		case "4": sair(); break;
		default:
			mostrarOpcaoInvalida(opcao);
		}
	}

	private void cadastrarProduto(Scanner scanner) {
		System.out.println("####  Cadastrar Produto  ####");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Descrição: ");
		String descricao = scanner.nextLine();

		System.out.print("Valor: ");
		float valor = Float.parseFloat(scanner.nextLine());

		controller.add(nome, descricao, valor);
	}

	private void listarProdutos() {
		System.out.println("####  Listar Produtos  ####");

		if (controller.count() == 0) {
			System.out.println("Não há produtos cadastrados!");
		} else {
			Produto p;
			for (int i = 0; i < controller.count(); i++) {
				p = controller.get(i);
				System.out.printf("Produto %d: %s - %s - %.2f", i+1, p.getNome(), p.getDescricao(), p.getValor());
			}
		}
	}

	private void removerProduto(Scanner scanner) {
		System.out.println("####  Remover Produto  ####");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		Produto p = controller.find(nome);
		if (p == null) {
			System.out.println("Produto não encontrado!");
		} else if (controller.remove(p)) {
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Não foi possível remover o produto!");
		}
	}

	private void sair() {
		System.out.println("Obrigado por utilizar nosso sistema");
	}

	private void mostrarOpcaoInvalida(String opcao) {
		System.out.printf("Opção inválida ('%s')!\n", opcao);
	}
}