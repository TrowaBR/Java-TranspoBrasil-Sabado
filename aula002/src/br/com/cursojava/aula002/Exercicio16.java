package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Verificar saldo");
		System.out.print("\nEscolha uma op��o: ");
		char opcao = scanner.nextLine().charAt(0);

		if (opcao == '1')
			System.out.println("Voc� escolheu a op��o Depositar");
		else if (opcao == '2')
			System.out.println("Voc� escolheu a op��o Sacar");
		else if (opcao == '3')
			System.out.println("Voc� escolheu a op��o Verificar saldo");
		else
			System.out.println("Op��o inv�lida");

		scanner.close();
	}

}