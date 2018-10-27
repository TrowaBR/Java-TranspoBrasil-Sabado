package br.com.cursojava.aula006.exercicio02;

public class AnimalController {

	private Animal[] lista = new Animal[50];
	private int count = 0;

	public int getCount() {
		return count;
	}

	private void add(Animal a) {
		if (count < lista.length) {
			lista[count++] = a;
		} else {
			System.out.println("A lista de animais está cheia!");
		}
	}

	public Animal get(int index) {
		if (index >= 0 && index < count) {
			return lista[index];
		} else {
			System.out.printf("Posição inválida (%d)!\n", index);
			return null;
		}
	}

	public void criarCachorro(String nome, int idade) {
		Cachorro c = new Cachorro();
		c.setNome(nome);
		c.setIdade(idade);
		add(c);
	}

	public void criarGato(String nome, int idade) {
		Gato g = new Gato();
		g.setNome(nome);
		g.setIdade(idade);
		add(g);
	}
}