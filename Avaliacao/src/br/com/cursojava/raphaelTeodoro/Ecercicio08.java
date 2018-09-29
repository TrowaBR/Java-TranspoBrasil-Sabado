package br.com.cursojava.raphaelTeodoro;

public class Ecercicio08 {

	public static void main(String[] args) {

		final int NUM_INICIO = 1;
		final int NUM_TERMINO = 50;
		String resultado = "";
		boolean primo;
		int limite;
		int i;

		int numero = NUM_INICIO;
		while (numero <= NUM_TERMINO) {
			primo = true;
			limite = Math.floorDiv(numero, 2); // Após a metade os numeradores apenas invertem (ex: 2*4 .. 4*2)

			i = 2;
			while (i <= limite && primo) {
				if (numero % i == 0)
					primo = false;

				i++;
			}
			if (primo)
				resultado += ", " + numero;

			numero++;
		}

		System.out.printf("Números primos entre %d e %d: %s.\n", NUM_INICIO, NUM_TERMINO, resultado.substring(2));
	}
}