package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("N�mero: ");
		int num = Integer.parseInt(scanner.nextLine());

		if (num % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("�mpar");

		scanner.close();
	}

}