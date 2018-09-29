package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = Integer.parseInt(scanner.nextLine());

		System.out.printf("Número %s\n", numero % 2 == 0 ? "par" : "ímpar");

		scanner.close();
	}
}