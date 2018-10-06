package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = Integer.parseInt(scanner.nextLine());
		int n2;
		boolean valido;
		do {
			System.out.printf("Digite um número maior que o anterior (%d): ", n1);
			n2 = Integer.parseInt(scanner.nextLine());

			valido = (n2 > n1);
			if (!valido) {
				System.out.println();
				System.out.println("Número abaixo do solicitado!");
				System.out.println();
			}
		} while (!valido);

		for (; n1 <= n2; n1++) {
			System.out.print(n1 + " ");
		}

		scanner.close();
	}
}