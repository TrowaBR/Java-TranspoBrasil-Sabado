package br.com.cursojava.exercicio;

import java.util.List;
import java.util.ArrayList;

public class ProdutoController {

	private List<Produto> lista;
	
	public ProdutoController() {
		lista = new ArrayList<Produto>();
	}

	public boolean criarProduto(String nome, String descricao, float valor) {
		return lista.add(new Produto(nome, descricao, valor));
	}
	
	public Produto get(int index) {
		return lista.get(index);
	}

	public Produto find(String nome) {
		for (Produto p : lista) {
			if (p.getNome().equals(nome)) {
				return p;
			}
		}
		return null;
	}
	
	public boolean remove(Produto p) {
		return lista.remove(p);
	}
	
	public int count() {
		return lista.size();
	}
}