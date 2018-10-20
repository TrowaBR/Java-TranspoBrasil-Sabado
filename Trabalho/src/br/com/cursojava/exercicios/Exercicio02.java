package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Inicializa��o
		double[] notas = new double[10];
		double media = 0;

		// Loop solicitando nota
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d: ", i + 1);
			notas[i] = Double.parseDouble(scanner.nextLine());

			// Memoriza valor para m�dia
			media += notas[i];
		}

		// Calcula m�dia
		media /= notas.length;

		// Apresenta resultado
		System.out.println();
		System.out.printf("Notas acima da m�dia (%.2f):\n", media);

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= media) {
				System.out.printf("Nota %d: %.2f\n", i + 1, notas[i]);
			}
		}

		scanner.close();
	}
}