package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Base: ");
		int base = Integer.parseInt(scanner.nextLine());

		System.out.print("Altura: ");
		int altura = Integer.parseInt(scanner.nextLine());

		System.out.println("�rea: " + (base * altura));
		System.out.println("Per�metro: " + ((base * 2) + (altura * 2)));

		scanner.close();
	}

}