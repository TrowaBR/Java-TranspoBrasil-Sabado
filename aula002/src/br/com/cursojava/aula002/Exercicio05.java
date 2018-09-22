package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		System.out.printf("\nIdade em dias: %d", (idade * 365));

		scanner.close();
	}

}