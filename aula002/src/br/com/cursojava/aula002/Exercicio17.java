package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		if (nome.length() < 3)
			System.out.printf("Nome inv�lido (%d letras)", nome.length());
		else
			System.out.printf("Nome v�lido (%d letras)", nome.length());

		scanner.close();
	}

}