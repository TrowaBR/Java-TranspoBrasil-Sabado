package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		System.out.println("Sua idade após 20 anos: " + (idade + 20));

		scanner.close();
	}
}