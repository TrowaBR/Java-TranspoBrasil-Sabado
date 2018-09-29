package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		String voto = "";
		voto = voto.equals("") && idade < 16 ? "Não pode votar" : voto;
		voto = voto.equals("") && idade < 18 ? "Facultativo" : voto;
		voto = voto.equals("") && idade < 65 ? "Obrigatório" : voto;
		voto = voto.equals("") ? "Facultativo" : voto;

		System.out.println("Voto: " + voto);

		scanner.close();
	}
}