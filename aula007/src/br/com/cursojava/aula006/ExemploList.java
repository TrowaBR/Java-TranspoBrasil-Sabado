package br.com.cursojava.aula006;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();

		nomes.add("João");
		nomes.add("Maria");

		System.out.println(nomes);
		System.out.println(nomes.size());

		nomes.add(0, "José");
		nomes.add(0, "Ana");
		System.out.println(nomes);

		nomes.set(0, "Tibúrcio");
		System.out.println(nomes);

		System.out.println(nomes.get(0));

		System.out.println(nomes.indexOf("João"));
		System.out.println(nomes.indexOf("Teste"));

		System.out.println(nomes.contains("João"));
		System.out.println(nomes.contains("Teste"));

		List<String> sublista = nomes.subList(2, nomes.size());
		System.out.println(sublista);
		
		nomes.remove(0);
		System.out.println(nomes);

		nomes.remove("Maria");
		System.out.println(nomes);
	}
}