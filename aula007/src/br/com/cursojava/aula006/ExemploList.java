package br.com.cursojava.aula006;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();

		nomes.add("Jo�o");
		nomes.add("Maria");

		System.out.println(nomes);
		System.out.println(nomes.size());

		nomes.add(0, "Jos�");
		nomes.add(0, "Ana");
		System.out.println(nomes);

		nomes.set(0, "Tib�rcio");
		System.out.println(nomes);

		System.out.println(nomes.get(0));

		System.out.println(nomes.indexOf("Jo�o"));
		System.out.println(nomes.indexOf("Teste"));

		System.out.println(nomes.contains("Jo�o"));
		System.out.println(nomes.contains("Teste"));

		List<String> sublista = nomes.subList(2, nomes.size());
		System.out.println(sublista);
		
		nomes.remove(0);
		System.out.println(nomes);

		nomes.remove("Maria");
		System.out.println(nomes);
	}
}