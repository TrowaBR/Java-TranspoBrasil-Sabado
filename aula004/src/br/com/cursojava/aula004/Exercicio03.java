package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		String inverso = "";
		int i = palavra.length() - 1;
		if (i >= 0) {
			do {
				inverso += palavra.charAt(i);
				i--;
			} while (i >= 0);
		}

		System.out.println("Palavra invertida: " + inverso);

		scanner.close();
	}
}