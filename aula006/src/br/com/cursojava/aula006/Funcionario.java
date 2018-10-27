package br.com.cursojava.aula006;

public class Funcionario {

	private String nome;
	private double salarioBase;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getPercInss() {
		return 0.11;
	}
	
	public double getBaseInss() {
		return getSalarioBase();
	}
	
	public double getDescontoInss() {
		return getBaseInss() * getPercInss();
	}

	public double getSalarioLiquido() {
		return getSalarioBase() - getDescontoInss();
	}
}