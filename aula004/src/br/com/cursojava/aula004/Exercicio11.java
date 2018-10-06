package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[10];
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d: ", i + 1);
			notas[i] = Double.parseDouble(scanner.nextLine());
			maior = Math.max(maior, notas[i]);
			menor = Math.min(menor, notas[i]);
		}

		System.out.println();
		System.out.println("Maior nota:" + maior);
		System.out.println("Menor nota:" + menor);
		System.out.println("Notas digitadas:");

		for (double nota : notas) {
			System.out.println(nota);
		}

		scanner.close();
	}
}