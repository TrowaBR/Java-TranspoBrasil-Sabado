package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] nomes = new String[5];

		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("Nome %d: ", i + 1);
			nomes[i] = scanner.nextLine();
		}

		System.out.println();
		System.out.println("Nomes digitados:");

		for (int i = nomes.length - 1; i >= 0; i--) {
			System.out.println(nomes[i]);
		}

		scanner.close();
	}
}