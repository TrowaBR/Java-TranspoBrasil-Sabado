package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio05 {

	public static void main(String[] args) {

		final int QTD_NOTAS = 10;
		Scanner scanner = new Scanner(System.in);

		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		double nota;

		int i = 0;
		while (i++ < QTD_NOTAS) {
			System.out.printf("Nota %d: ", i);
			nota = Double.parseDouble(scanner.nextLine());
			menor = nota < menor ? nota : menor;
			maior = nota > maior ? nota : maior;
		}

		System.out.println("Menor nota: " + menor);
		System.out.println("Maior nota: " + maior);

		scanner.close();
	}
}