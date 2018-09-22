package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double media = 0;

		System.out.print("Nota 1: ");
		media += Double.parseDouble(scanner.nextLine());

		System.out.print("Nota 2: ");
		media += Double.parseDouble(scanner.nextLine());

		System.out.print("Nota 3: ");
		media += Double.parseDouble(scanner.nextLine());

		System.out.print("Nota 4: ");
		media += Double.parseDouble(scanner.nextLine());

		media /= 4;

		String status;

		if (media >= 9)
			status = "Conceito A";
		else if (media >= 8)
			status = "Conceito B";
		else if (media >= 6)
			status = "Conceito C";
		else if (media >= 5)
			status = "Conceito D";
		else
			status = "Insuficiente";

		System.out.printf("\nMédia: %.2f\n", media);
		System.out.println(status);

		scanner.close();
	}

}