package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int idade;
		do {
			System.out.print("Idade: ");
			idade = Integer.parseInt(scanner.nextLine());

			if (idade < 0)
				System.out.printf("Idade inválida (%d)!\n\n", idade);
		} while (idade < 0);

		System.out.println("Idade válida, encerrando aplicação.");

		scanner.close();
	}
}