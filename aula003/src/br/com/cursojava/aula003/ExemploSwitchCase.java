package br.com.cursojava.aula003;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número (1-7): ");
		int dia = Integer.parseInt(scanner.nextLine());

		String extenso;
		switch (dia) {
		case 1: extenso = "Domingo"; break;
		case 2: extenso = "Segunda-feira"; break;
		case 3: extenso = "Terça-feira"; break;
		case 4: extenso = "Quarta-feira"; break;
		case 5: extenso = "Quinta-feira"; break;
		case 6: extenso = "Sexta-feira"; break;
		case 7: extenso = "Sábado"; break;
		default: extenso = "Dia inválido";
		}
		
		System.out.println(extenso);

		scanner.close();
	}
}
