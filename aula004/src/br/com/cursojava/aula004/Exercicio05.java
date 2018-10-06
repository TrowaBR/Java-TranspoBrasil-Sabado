package br.com.cursojava.aula004;

public class Exercicio05 {

	public static void main(String[] args) {

		final int MAXIMO = 50;

		int soma = 0;
		for (int i = 1; i <= MAXIMO; i++) {
			soma += i;
		}
		System.out.print("Soma: " + soma);
	}
}