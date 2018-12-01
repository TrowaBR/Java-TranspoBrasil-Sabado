package br.com.cursojava.exercicio;

public class Produto {

	private String nome;
	private String descricao;
	private float valor;

	public Produto() {
		super();
	}

	public Produto(String nome, String descricao, float valor) {
		this();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}