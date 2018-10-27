package br.com.cursojava.aula006.exercicio01;

public class Aviao extends Veiculo {

	private boolean voando = true;
	
	public void voar() {
		voando = true;
	}

	public boolean isVoando() {
		return voando;
	}
}