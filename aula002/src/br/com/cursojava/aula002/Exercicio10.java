package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double media = 0;

		System.out.print("Nota 1: ");
		media += Double.parseDouble(scanner.nextLine());

		System.out.print("Nota 2: ");
		media += Double.parseDouble(scanner.nextLine());

		System.out.print("Nota 3: ");
		media += Double.parseDouble(scanner.nextLine());

		media /= 3;
		String status;
		if (media >= 7)
			status = "Aprovado";
		else
			status = "Reprovado";

		System.out.printf("\nStatus: %s (%.2f)", status, media);

		scanner.close();
	}

}