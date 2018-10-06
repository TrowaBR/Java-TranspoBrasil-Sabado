package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[5];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d: ", i + 1);
			notas[i] = Double.parseDouble(scanner.nextLine());
		}

		System.out.println();
		System.out.println("Notas digitadas:");

		for (double nota : notas) {
			System.out.println(nota);
		}

		scanner.close();
	}
}