package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		int numero = Integer.parseInt(scanner.nextLine());

		System.out.printf("N�mero %s\n", numero % 2 == 0 ? "par" : "�mpar");

		scanner.close();
	}
}