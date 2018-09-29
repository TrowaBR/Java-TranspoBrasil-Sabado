package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine().trim();

		String palavra = frase.substring(frase.lastIndexOf(" ") + 1);

		System.out.println("Última palavra: " + palavra);

		scanner.close();
	}
}