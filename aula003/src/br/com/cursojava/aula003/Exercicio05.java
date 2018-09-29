package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.println("Caractéres: " + nome.length());

		scanner.close();
	}
}