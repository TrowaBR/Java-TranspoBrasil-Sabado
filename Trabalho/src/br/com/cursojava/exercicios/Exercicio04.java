package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Inicialização
		String[] produtos = new String[20];
		String texto = "";
		boolean exists = false;

		// Loop solicitando produtos
		for (int i = 0; i < produtos.length; i++) {
			do {
				// Retorno caso o produto já exista na lista
				if (exists) {
					System.out.printf("\nProduto '%s' já existe na lista!\n\n", texto);
				}

				System.out.printf("Produto %d: ", i + 1);
				texto = scanner.nextLine();

				// Verifica se está na lista
				exists = false;
				for (String produto : produtos) {
					if (texto.equals(produto)) {
						exists = true;
						break;
					}
				}
			} while (exists);

			produtos[i] = texto;
		}

		// Loop de busca de produto
		boolean sair;
		do {
			System.out.println();
			System.out.print("Busca de produto ('sair' para encerrar): ");
			texto = scanner.nextLine();

			// Verifica saída do loop
			sair = "sair".equalsIgnoreCase(texto);
			if (!sair) {
				// Pesquisa produto
				exists = false;
				for (String produto : produtos) {
					if (texto.equals(produto)) {
						exists = true;
						break;
					}
				}

				// Apresenta resultado
				if (exists) {
					System.out.println("Produto encontrado.");
				} else {
					System.out.println("Produto NÃO encontrado.");
				}
			}
		} while (!sair);

		scanner.close();
	}
}