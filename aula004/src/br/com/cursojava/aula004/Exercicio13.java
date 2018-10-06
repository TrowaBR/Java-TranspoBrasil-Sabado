package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] nomes = new String[10];
		String maiorNome = "";

		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("Nome %d: ", i + 1);
			nomes[i] = scanner.nextLine();

			if (nomes[i].length() > maiorNome.length())
				maiorNome = nomes[i];
		}

		System.out.println();
		System.out.printf("Maior nome: %s (%d caracteres)", maiorNome, maiorNome.length());

		scanner.close();
	}
}