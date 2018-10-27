package br.com.cursojava.aula006.exercicio02;

public class Cachorro extends Animal {

	@Override
	public void correr() {
		System.out.printf("Cachorro '%s' corre.\n", getNome());
	}

	@Override
	public void comer(String comida) {
		System.out.printf("Cachorro '%s' comeu '%s'.\n", getNome(), comida);
	}
}