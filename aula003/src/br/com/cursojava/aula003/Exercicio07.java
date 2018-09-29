package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();

		frase = frase.replaceAll("[aAáÁàÀeãÃâÂäÄEéÉèÈêÊëËiIíÍìÌîÎïÏoOóÓòÒõÕôÔöÖuUúÚùÙûÛüÜ]","");

		System.out.println("Frase sem vogais: " + frase);

		scanner.close();
	}
}