package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Valor: ");
		double valor = Double.parseDouble(scanner.nextLine());

		System.out.print("Desconto(%): ");
		double percDesconto = Double.parseDouble(scanner.nextLine());

		double desconto = Math.round(valor * percDesconto) / 100f;

		System.out.printf("\nDesconto: %.2f", desconto);
		System.out.printf("\nValor final: %.2f", (valor - desconto));

		scanner.close();
	}

}