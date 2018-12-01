package br.com.cursojava.aula007;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
		Map<String, Pessoa> mapa = new HashMap<String, Pessoa>();

		mapa.put("123456", new Pessoa("Maria"));
		mapa.put("789012", new Pessoa("João"));
		mapa.put("teste1", new Pessoa("Mariana"));
		System.out.println(mapa);

		System.out.println(mapa.size());

		mapa.put("troca", new Pessoa("Pessoa1"));
		mapa.put("troca", new Pessoa("Tibúrcio"));
		System.out.println(mapa);

		System.out.println(mapa.containsKey("123456"));

		System.out.println(mapa.containsValue(new Pessoa("Maria")));

		System.out.println(mapa.get("troca"));

		System.out.println(mapa.keySet());

		System.out.println(mapa.values());

		for (Map.Entry<String, Pessoa> pessoa : mapa.entrySet()) {
			System.out.println(pessoa.getKey() + " - " + pessoa.getValue());
		}
		
		mapa.remove("123456");
		System.out.println(mapa);
		
		mapa.clear();
		System.out.println(mapa);
	}
}