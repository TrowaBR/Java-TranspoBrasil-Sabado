package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome = null;

		while (nome == null || !nome.equals("")) {

			if (nome != null)
				System.out.println("Tamanho: " + nome.length());

			System.out.print("Informe um nome (branco para sair): ");
			nome = scanner.nextLine().trim();
		}

		scanner.close();
	}
}