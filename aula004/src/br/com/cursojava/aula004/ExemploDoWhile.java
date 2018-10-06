package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int codigo;
		do {
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair");
			System.out.print("Selecione uma op��o: ");
			codigo = Integer.parseInt(scanner.nextLine());
			System.out.print("\n");

			switch (codigo) {
			case 1:
				System.out.println("Escolheu a op��o 'Cadastrar Produto'");
				break;
			case 2:
				System.out.println("Escolheu a op��o 'Listar Produtos'");
				break;
			case 3:
				System.out.println("Escolheu a op��o 'Remover Produto'");
				break;
			case 4:
				System.out.print("Deseja realmente sair (s/n)? ");
				if (!scanner.nextLine().equalsIgnoreCase("s"))
					codigo = 0;
				break;
			default:
				System.out.printf("Op��o inv�lida ('%d')!\n", codigo);
			}
			System.out.print("\n");
		} while (codigo != 4);

		System.out.println("Fim da aplica��o.");

		scanner.close();
	}
}