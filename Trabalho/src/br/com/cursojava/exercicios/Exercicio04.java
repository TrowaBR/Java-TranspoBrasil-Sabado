package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Inicializa��o
		String[] produtos = new String[20];
		String texto = "";
		boolean exists = false;

		// Loop solicitando produtos
		for (int i = 0; i < produtos.length; i++) {
			do {
				// Retorno caso o produto j� exista na lista
				if (exists) {
					System.out.printf("\nProduto '%s' j� existe na lista!\n\n", texto);
				}

				System.out.printf("Produto %d: ", i + 1);
				texto = scanner.nextLine();

				// Verifica se est� na lista
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

			// Verifica sa�da do loop
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
					System.out.println("Produto N�O encontrado.");
				}
			}
		} while (!sair);

		scanner.close();
	}
}