package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar produtos");
		System.out.println("3 - Pesquisar produtos");
		System.out.println("4 - Remover produto");
		System.out.println("5 - Sair");
		System.out.print("Escolha uma opção: ");
		int opcao = Integer.parseInt(scanner.nextLine());

		switch (opcao) {
		case 1: System.out.println("Você escolheu a opção Cadastrar produto"); break;
		case 2: System.out.println("Você escolheu a opção Listar produtos"); break;
		case 3: System.out.println("Você escolheu a opção Pesquisar produtos"); break;
		case 4: System.out.println("Você escolheu a opção Remover produto"); break;
		case 5: System.out.println("Obrigado por usar nossos terminais de atendimento"); break;
		default: System.out.println("Opção inválida");
		}

		scanner.close();
	}
}