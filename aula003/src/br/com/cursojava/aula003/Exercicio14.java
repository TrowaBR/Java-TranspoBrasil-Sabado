package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio14 {

	static final int NUM_MIN = 1;
	static final int NUM_MAX = 100;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String numeros = "";
		int i = NUM_MIN;
		while (i <= NUM_MAX) {
			if (i % 2 == 1)
				numeros += ", " + i;
			i++;
		}
		System.out.println(numeros.substring(2) + ".");

		scanner.close();
	}
}