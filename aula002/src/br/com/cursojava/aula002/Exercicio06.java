package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		final int DIAS_ANO = 360;
		final int DIAS_MES = 30;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Número de dias: ");
		int dias = Integer.parseInt(scanner.nextLine());

		int anos = Math.round(dias / DIAS_ANO);
		dias -= (anos * 360);

		int meses = Math.round(dias / DIAS_MES);
		dias -= (meses * DIAS_MES);

		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);

		scanner.close();
	}

}