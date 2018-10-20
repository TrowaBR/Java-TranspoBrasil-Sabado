package br.com.cursojava.aula005;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double[][] notasAlunos = new double[5][3];
		double[] medias = new double[notasAlunos.length];

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.printf("Aluno %d:\n", i + 1);
			medias[i] = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.printf("Nota %d: ", j + 1);
				notasAlunos[i][j] = Double.parseDouble(scanner.nextLine());
				medias[i] += notasAlunos[i][j];
			}
			medias[i] /= notasAlunos[i].length;
			System.out.println();
		}

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.printf("Aluno %d - Notas: ", i + 1);
			for (double nota : notasAlunos[i]) {
				System.out.print(nota + "  ");
			}
			System.out.println("- Média: " + medias[i]);
		}

		scanner.close();
	}
}