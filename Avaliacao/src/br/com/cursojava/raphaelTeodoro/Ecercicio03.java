package br.com.cursojava.raphaelTeodoro;

import java.util.Scanner;

public class Ecercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe uma palavra: ");
		String palavra = scanner.nextLine();

		String inverso = "";
		int i = palavra.length();
		while (--i >= 0) {
			inverso += palavra.charAt(i);
		}

		System.out.println("Palavra invertida: " + inverso);

		scanner.close();
	}
}