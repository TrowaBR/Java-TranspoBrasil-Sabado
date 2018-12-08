package br.com.cursojava.aula010web.produto;

import java.util.List;

public class FacadeProduto {
	
	private RepositorioProduto repo = new RepositorioProduto();

	public List<Produto> carregarProdutos() {
		return repo.buscarTodos();
	}
}