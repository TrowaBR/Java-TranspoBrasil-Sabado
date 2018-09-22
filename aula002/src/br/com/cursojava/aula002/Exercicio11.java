package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		if (idade >= 18)
			System.out.println("Já pode fazer a CNH.");
		else
			System.out.println("Não pode fazer a CNH.");

		scanner.close();
	}

}