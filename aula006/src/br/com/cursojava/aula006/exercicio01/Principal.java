package br.com.cursojava.aula006.exercicio01;

public class Principal {

	public static void main(String[] args) {
//		Veiculo v1 = new Veiculo();
//		Veiculo v2 = new Carro();
		Aviao av = new Aviao(); // Possui métodos de "Aviao"
		Veiculo v3 = av;        // Possui métodos de "Veiculo"
		
		v3.ligar();
		v3.acelerar(10);
		if (v3 instanceof Aviao) {
			((Aviao)v3).voar();
		}
		v3.parar();
		v3.desligar();
		
		av.ligar();
		av.acelerar(10);
		av.voar();
		av.parar();
		av.desligar();
	}
}