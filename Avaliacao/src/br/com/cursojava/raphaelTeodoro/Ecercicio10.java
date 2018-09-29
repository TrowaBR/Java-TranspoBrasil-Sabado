package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		System.out.print("Altura: ");
		double altura = Double.parseDouble(scanner.nextLine());

		System.out.print("Peso: ");
		double peso = Double.parseDouble(scanner.nextLine());

		double imc = peso / (altura * altura);

		String mensagem;
		if (imc < 18.5)
			mensagem = "Abaixo do peso";
		else if (imc < 25)
			mensagem = "Peso normal";
		else if (imc < 30)
			mensagem = "Acima do peso";
		else if (imc < 35)
			mensagem = "Obesidade I";
		else if (imc < 40)
			mensagem = "Obesidade II";
		else
			mensagem = "Obesidade III (mórbida)";

		System.out.println("Idade: " + idade);
		System.out.printf("IMC: %.2f - %s", imc, mensagem);

		scanner.close();
	}
}