package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ano: ");
		int ano = Integer.parseInt(scanner.nextLine());

		if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0)
			System.out.println("Ano bissexto");
		else
			System.out.println("Ano não bissexto");

		scanner.close();
	}

}