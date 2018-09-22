package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploConversaoDados {

	public static void main(String[] args) {
		final int NOTAS = 3;

		double soma = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < NOTAS; i++) {
			System.out.printf("Nota %d: ", i + 1);
			soma += Double.parseDouble(scanner.nextLine()) / NOTAS;
		}

		System.out.printf("\nMédia das %d notas: %.2f\n", NOTAS, soma);

		scanner.close();
	}
}
