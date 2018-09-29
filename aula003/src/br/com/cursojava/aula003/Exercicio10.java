package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();

		System.out.println("Possui 'l' ou 'L': " + palavra.toUpperCase().contains("L"));

		scanner.close();
	}
}