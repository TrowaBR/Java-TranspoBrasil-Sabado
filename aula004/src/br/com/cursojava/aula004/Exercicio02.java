package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String opcao;
		do {
			System.out.println("A - Abrir arquivo");
			System.out.println("B - Procurar arquivo");
			System.out.println("C - Download arquivo");
			System.out.println("D - Upload arquivo");
			System.out.println("S - Sair");
			System.out.print("Selecione uma opção: ");
			opcao = scanner.nextLine().trim().substring(0, 1).toUpperCase();
			System.out.print("\n");

			switch (opcao) {
			case "A":
				System.out.println("Escolheu a opção 'Abrir arquivo'");
				break;
			case "B":
				System.out.println("Escolheu a opção 'Procurar arquivo'");
				break;
			case "C":
				System.out.println("Escolheu a opção 'Download arquivo'");
				break;
			case "D":
				System.out.println("Escolheu a opção 'Upload arquivo'");
				break;
			case "S":
				System.out.print("Deseja realmente sair (s/n)? ");
				if (!scanner.nextLine().equalsIgnoreCase("s"))
					opcao = "";
				break;
			default:
				System.out.printf("Opção inválida ('%s')!\n", opcao);
			}
			System.out.print("\n");
		} while (!"S".equalsIgnoreCase(opcao));

		System.out.println("Encerrando aplicação.");

		scanner.close();
	}
}