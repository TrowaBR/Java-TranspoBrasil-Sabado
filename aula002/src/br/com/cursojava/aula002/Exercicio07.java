package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("N: ");
		double num = Double.parseDouble(scanner.nextLine());

		System.out.println("N²: " + Math.pow(num, 2));

		scanner.close();
	}

}