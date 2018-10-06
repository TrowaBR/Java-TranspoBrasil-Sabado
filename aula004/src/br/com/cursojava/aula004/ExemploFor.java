package br.com.cursojava.aula004;

public class ExemploFor {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int pos = 0;
		String mensagem = "Brasil!";
		for (; pos < mensagem.length(); pos++) {
			System.out.print(mensagem.charAt(pos) + " - ");
		}

		System.out.println();

		boolean continuar = true;
		int qt = 10;
		for (; continuar;) {
			System.out.print(qt + " ");
			qt--;
			continuar = qt > 0;
		}

		System.out.println();

		for (;;) {
			System.out.print(qt + " ; ");
			qt++;
			if (qt > 10)
				break;
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.print(i + " ");
		}

		System.out.println();

	}
}