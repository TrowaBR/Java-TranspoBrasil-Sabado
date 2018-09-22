package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double media = 0;

		System.out.print("Nota 1: ");
		media += Double.parseDouble(scanner.nextLine()) * 2f / 10f;

		System.out.print("Nota 2: ");
		media += Double.parseDouble(scanner.nextLine()) * 3f / 10f;

		System.out.print("Nota 3: ");
		media += Double.parseDouble(scanner.nextLine()) * 5f / 10f;

		System.out.printf("\nMédia: %.2f", media);

		scanner.close();
	}

}