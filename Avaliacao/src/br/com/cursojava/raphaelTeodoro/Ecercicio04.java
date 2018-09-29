package br.com.cursojava.raphaelTeodoro;

public class Ecercicio04 {

	public static void main(String[] args) {

		final int NUM_INICIO = 1;
		final int NUM_TERMINO = 50;

		int soma = 0;
		int i = NUM_INICIO;
		while (i <= NUM_TERMINO) {
			soma += i;
			i++;
		}

		System.out.printf("A soma entre os números de %d a %d é %d\n", NUM_INICIO, NUM_TERMINO, soma);
	}
}