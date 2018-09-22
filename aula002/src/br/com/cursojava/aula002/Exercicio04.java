package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Peso: ");
		double peso = Double.parseDouble(scanner.nextLine());

		System.out.print("Altura: ");
		double altura = Double.parseDouble(scanner.nextLine());

		System.out.printf("\nIMC: %.2f", (peso / (altura * altura)));

		scanner.close();
	}

}