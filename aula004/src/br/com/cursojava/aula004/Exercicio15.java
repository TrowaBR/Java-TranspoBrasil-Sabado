package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double percDesconto = 0.1;
		double[] valores = new double[10];

		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Valor do produto %d: ", i + 1);
			valores[i] = Double.parseDouble(scanner.nextLine());
		}

		System.out.println();
		System.out.printf("Desconto: %.2f%%\n", percDesconto * 100);

		double desconto;
		for (int i = 0; i < valores.length; i++) {
			desconto = valores[i] * percDesconto;
			System.out.printf("Produto %d: %.2f (%.2f - %.2f)\n", i, valores[i] - desconto, valores[i], desconto);
		}

		scanner.close();
	}
}