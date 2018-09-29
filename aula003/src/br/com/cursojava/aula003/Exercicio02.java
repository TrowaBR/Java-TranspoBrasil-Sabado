package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Salário: ");
		double salario = Double.parseDouble(scanner.nextLine());

		String isencao = salario < 1800 ? "Isento do IR" : "Não é isento do IR";
		System.out.println(isencao);

		scanner.close();
	}
}