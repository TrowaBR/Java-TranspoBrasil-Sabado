package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio17 {

	static final int TOTAL_NOTAS = 10;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i = 1;
		double menor = Double.MAX_VALUE;
		double nota  = 0d;

		while (i <= TOTAL_NOTAS) {
			System.out.printf("Nota %d: ", i);
			nota  = Double.parseDouble(scanner.nextLine());
			menor = nota < menor ? nota : menor;
			i++;
		}

		System.out.println("Menor nota: " + menor);

		scanner.close();
	}
}