package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o valor do produto: ");
		double valor = Double.parseDouble(scanner.nextLine());
		double percentual;

		if (valor < 1800)
			percentual = 0.11;
		else if (valor < 2500)
			percentual = 0.15;
		else
			percentual = 0.18;
	
		double desconto = Math.floor(valor * percentual * 100) / 100;
		double liquido  = valor - desconto;
		
		System.out.printf("Desconto: %.2f (%.2f%%)\n", desconto, percentual*100);
		System.out.println("Líquido: " + liquido);

		scanner.close();
	}
}