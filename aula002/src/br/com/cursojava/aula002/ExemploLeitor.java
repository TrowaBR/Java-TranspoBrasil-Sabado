package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploLeitor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		System.out.printf("\nO nome informado foi %s\n", nome);
		scanner.close();
	}
}
