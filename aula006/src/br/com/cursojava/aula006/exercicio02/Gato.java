package br.com.cursojava.aula006.exercicio02;

public class Gato extends Animal {

	@Override
	public void correr() {
		System.out.printf("Gato '%s' corre.\n", getNome());
	}

	@Override
	public void comer(String comida) {
		System.out.printf("Gato '%s' comeu '%s'.\n", getNome(), comida);
	}

	public void comer(String comida, int quantidade) {
		System.out.printf("Gato '%s' comeu %d '%s'.\n", getNome(), quantidade, comida);
	}
}