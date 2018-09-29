package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua idade: ");
		int idade = Integer.parseInt(scanner.nextLine());
		String tipo;

		if (idade < 12)
			tipo = "Criança";
		else if (idade < 17)
			tipo = "Adolescente";
		else if (idade < 24)
			tipo = "Jovem";
		else if (idade < 59)
			tipo = "Adulto";
		else
			tipo = "Idoso";

		System.out.println("Classificação: " + tipo);

		scanner.close();
	}
}