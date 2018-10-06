package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		final int MINIMO = 1;
		final int MAXIMO = 20;

		Scanner scanner = new Scanner(System.in);
		boolean valido;
		int numero;
		do {
			System.out.printf("Digite um número entre %d e %d: ", MINIMO, MAXIMO);
			numero = Integer.parseInt(scanner.nextLine());

			valido = (numero >= MINIMO && numero <= MAXIMO);
			if (!valido) {
				System.out.println();
				System.out.println("Número fora da faixa solicitada!");
				System.out.println();
			}
		} while (!valido);

		int fatorial = 1;
		for (; numero > 1; numero--) {
			fatorial *= numero;
		}
		System.out.print("Fatorial: " + fatorial);

		scanner.close();
	}
}