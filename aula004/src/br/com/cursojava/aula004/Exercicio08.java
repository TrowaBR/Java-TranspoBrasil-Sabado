package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();

		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.substring(0, i+1));
		}

		scanner.close();
	}
}