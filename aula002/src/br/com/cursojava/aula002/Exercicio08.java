package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nota 1: ");
		double num = Double.parseDouble(scanner.nextLine());
		double maior = num;
		double menor = num;

		System.out.print("Nota 2: ");
		num = Double.parseDouble(scanner.nextLine());
		maior = Math.max(maior, num);
		menor = Math.min(maior, num);

		System.out.print("Nota 3: ");
		num = Double.parseDouble(scanner.nextLine());
		maior = Math.max(maior, num);
		menor = Math.min(maior, num);

		System.out.println("Menor nota: " + menor);
		System.out.println("Maior nota: " + maior);

		scanner.close();
	}

}