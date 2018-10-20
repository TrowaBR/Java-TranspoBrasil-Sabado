package br.com.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio03 {

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

		// Verifica tamanho das listas
		int qtdAcimaMedia = 0;
		for (double nota : notas) {
			if (nota >= media) {
				qtdAcimaMedia++;
			}
		}

		// Monta listas acima/abaixo da m�dia
		double[] notasAcima = new double[qtdAcimaMedia];
		double[] notasAbaixo = new double[notas.length - qtdAcimaMedia];

		int i = 0;
		int j = 0;
		for (double nota : notas) {
			if (nota >= media) {
				notasAcima[i++] = nota;
			} else {
				notasAbaixo[j++] = nota;
			}
		}

		// Apresenta resultado
		System.out.println("\nM�dia: " + media);

		System.out.printf("Notas acima  (%d): ", notasAcima.length);
		for (double nota : notasAcima) {
			System.out.print(nota + "  ");
		}

		System.out.println();
		System.out.printf("Notas abaixo (%d): ", notasAbaixo.length);
		for (double nota : notasAbaixo) {
			System.out.print(nota + "  ");
		}

		scanner.close();
	}
}