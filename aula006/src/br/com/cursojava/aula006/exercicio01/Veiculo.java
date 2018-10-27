package br.com.cursojava.aula006.exercicio01;

public class Veiculo {

	private boolean ligado = false;
	private int velocidade = 0;

	public int getVelocidade() {
		return velocidade;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void acelerar(int valor) {
		velocidade += valor;
	}

	public void parar() {
		velocidade = 0;
	}

	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		parar();
		ligado = false;
	}
}