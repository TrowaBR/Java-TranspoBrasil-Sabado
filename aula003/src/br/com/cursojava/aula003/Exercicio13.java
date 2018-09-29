package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio13 {

	static final int TOTAL_NOTAS = 20;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i = 1;
		double soma = 0f;

		while (i <= TOTAL_NOTAS) {
			System.out.printf("Nota %d: ", i);
			soma += Double.parseDouble(scanner.nextLine());
			i++;
		}

		System.out.printf("Média: %.2f (%.2f / %d)", soma / TOTAL_NOTAS, soma, TOTAL_NOTAS);

		scanner.close();
	}
}