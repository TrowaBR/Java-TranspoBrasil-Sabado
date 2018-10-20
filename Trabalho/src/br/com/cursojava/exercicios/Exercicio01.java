package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Inicialização
		String[] nomes = new String[10];
		double[] notas = new double[nomes.length];
		int idxMaiorNota = -1;
		int idxMenorNota = -1;

		// Loop solicitando nome e nota
		for (int i = 0; i < nomes.length; i++) {

			System.out.println("Aluno " + (i + 1));

			System.out.print("Nome: ");
			nomes[i] = scanner.nextLine();

			System.out.print("Nota: ");
			notas[i] = Double.parseDouble(scanner.nextLine());

			// Memoriza maior/menor nota
			if (idxMaiorNota < 0 || notas[i] > notas[idxMaiorNota]) {
				idxMaiorNota = i;
			}

			if (idxMenorNota < 0 || notas[i] < notas[idxMenorNota]) {
				idxMenorNota = i;
			}

			System.out.println();
		}

		// Apresenta resultado
		System.out.printf("Maior nota: %s (%.2f)\n", nomes[idxMaiorNota], notas[idxMaiorNota]);
		System.out.printf("Menor nota: %s (%.2f)\n", nomes[idxMenorNota], notas[idxMenorNota]);

		scanner.close();
	}
}