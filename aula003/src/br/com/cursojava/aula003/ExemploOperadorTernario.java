package br.com.cursojava.aula003;

import java.util.Scanner;

public class ExemploOperadorTernario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		String tipo = idade >= 18 ? "maior" : "menor";
		System.out.printf("Você é %s de idade.\n", tipo);

		scanner.close();
	}
}