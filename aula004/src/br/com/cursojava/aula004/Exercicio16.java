package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] nomes = new String[10];
		double[] notas = new double[nomes.length];
		double media = 0;

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Aluno " + (i + 1));
			System.out.print("Nome: ");
			nomes[i] = scanner.nextLine();

			System.out.print("Nota: ");
			notas[i] = Double.parseDouble(scanner.nextLine());

			media += notas[i];
			System.out.println();
		}
		media /= notas.length;

		System.out.println("Média: " + media);

		String msg;
		for (int i = 0; i < nomes.length; i++) {
			if (notas[i] >= media)
				msg = "Acima da média";
			else
				msg = "Abaixo da média";

			System.out.printf("Aluno %d - %s: %s (%.2f)\n", i + 1, nomes[i], msg, notas[i]);
		}

		scanner.close();
	}
}