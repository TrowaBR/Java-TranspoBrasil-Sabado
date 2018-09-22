package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		String categoria;

		if (idade >= 18)
			categoria = "Adulto";
		else if (idade >= 14)
			categoria = "Juvenil";
		else if (idade >= 12)
			categoria = "Infanto Juvenil";
		else if (idade >= 9)
			categoria = "Infantil";
		else
			categoria = "Mirim";

		System.out.println("Categoria: " + categoria);

		scanner.close();
	}

}