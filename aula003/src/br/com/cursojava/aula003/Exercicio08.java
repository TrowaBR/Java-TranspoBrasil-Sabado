package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine().trim();

		int idx = frase.indexOf(" ");
		String palavra = idx >= 0 ? frase.substring(0, idx) : frase;

		System.out.println("Primeira palavra: " + palavra);

		scanner.close();
	}
}