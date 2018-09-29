package br.com.cursojava.aula003;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um n�mero (1-7): ");
		int dia = Integer.parseInt(scanner.nextLine());

		String extenso;
		switch (dia) {
		case 1: extenso = "Domingo"; break;
		case 2: extenso = "Segunda-feira"; break;
		case 3: extenso = "Ter�a-feira"; break;
		case 4: extenso = "Quarta-feira"; break;
		case 5: extenso = "Quinta-feira"; break;
		case 6: extenso = "Sexta-feira"; break;
		case 7: extenso = "S�bado"; break;
		default: extenso = "Dia inv�lido";
		}
		
		System.out.println(extenso);

		scanner.close();
	}
}
