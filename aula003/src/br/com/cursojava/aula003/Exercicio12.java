package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String frase = scanner.nextLine();
		
		int metade = Math.floorDiv(frase.length(), 2);

		System.out.println("Frase formatada: " + frase.substring(0, metade).toUpperCase() + frase.substring(metade).toLowerCase());

		scanner.close();
	}
}