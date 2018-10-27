package br.com.cursojava.aula006.exercicio02;

import java.util.Scanner;

public class AppAnimais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CadastroAnimal cadastro = new CadastroAnimal();
		cadastro.mostrarMenu(scanner);
		scanner.close();
	}
}
