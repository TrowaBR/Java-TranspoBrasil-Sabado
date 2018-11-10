package br.com.cursojava.exercicio;

import java.util.Scanner;

public class AppProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CadastroProduto cadastro = new CadastroProduto();
		cadastro.mostrarMenu(scanner);
		scanner.close();
	}
}