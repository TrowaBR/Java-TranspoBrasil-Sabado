package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[10];
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d: ", i + 1);
			notas[i] = Double.parseDouble(scanner.nextLine());
			media += notas[i];
		}
		media /= notas.length;

		System.out.println();
		System.out.println("Média:" + media);
		System.out.println("Notas abaixo da média:");

		for (double nota : notas) {
			if (nota < media)
				System.out.println(nota);
		}

		scanner.close();
	}
}