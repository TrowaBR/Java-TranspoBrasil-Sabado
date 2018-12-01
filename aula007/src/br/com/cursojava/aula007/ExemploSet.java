package br.com.cursojava.aula007;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {

	static enum MinhaEnum {
		A,
		B,
		C,
	}

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();

		nomes.add("Maria");
		nomes.add("Ana");
		System.out.println(nomes);

		System.out.println(nomes.add("Ana")); // Não duplica
		System.out.println(nomes);

		System.out.println(nomes.size());

		System.out.println(nomes.contains("Beatriz"));

		System.out.println(nomes.isEmpty());

		Iterator<String> i = nomes.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		nomes.remove("Maria");
		System.out.println(nomes);

		Set<MinhaEnum> items = new HashSet<MinhaEnum>();
		items.add(MinhaEnum.A);
		items.add(MinhaEnum.B);
		items.add(MinhaEnum.C);
		System.out.println(items);
	}
}