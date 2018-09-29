package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio07 {

	public static void main(String[] args) {

		final int POTENCIA = 5;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número: ");
		double numero = Double.parseDouble(scanner.nextLine());

		System.out.printf("%.2f ^ %d = %.2f\n", numero, POTENCIA, Math.pow(numero, POTENCIA));

		scanner.close();
	}
}