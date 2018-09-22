package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Salário: ");
		double salario = Double.parseDouble(scanner.nextLine());
		double percInss = 0.08;
		double valorInss = salario * percInss;
		double baseIr = salario - valorInss;
		double percIr;

		if (baseIr <= 1800)
			percIr = 0;
		else if (baseIr <= 2400)
			percIr = 0.075;
		else if (baseIr <= 3600)
			percIr = 0.24;
		else
			percIr = 0.32;

		double valorIr = baseIr * percIr;
		double liquido = salario - valorInss - valorIr;
		scanner.close();

		System.out.printf("\nSalário: %.2f\n", salario);
		System.out.printf("INSS (%.2f%%): %.2f\n", percInss * 100, valorInss);
		System.out.printf("Base de IR: %.2f\n", baseIr);
		System.out.printf("IR (%.2f%%): %.2f\n", percIr * 100, valorIr);
		System.out.printf("Líquido: %.2f\n", liquido);
	}

}