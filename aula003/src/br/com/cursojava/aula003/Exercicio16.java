package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Palavra: ");
		String palavra = scanner.nextLine().trim();

		int i = 1;
		String aux = palavra;

		System.out.printf("Repetindo %d vezes:\n", palavra.length());
		while (i <= palavra.length()) {
			System.out.println(aux);
			i++;
			aux += " " + palavra;
		}

		scanner.close();
	}
}