package br.com.cursojava.aula005;

import java.util.Scanner;

public class AppContato {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CadastroContato cadastro = new CadastroContato();
		cadastro.mostrarMenu(scanner);
		scanner.close();
	}

}