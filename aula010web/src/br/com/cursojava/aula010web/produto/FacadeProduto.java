package br.com.cursojava.aula010web.produto;

import java.util.List;

public class FacadeProduto {
	
	private RepositorioProduto repo = new RepositorioProduto();

	public List<Produto> carregarProdutos() {
		return repo.buscarTodos();
	}

	public Produto novoProduto() {
		return new Produto();
	}

	public Produto buscarProdutoPorId(Integer id) {
		return repo.buscarPorId(id);
	}

	public boolean salvar(Produto produto) {
		produto = repo.salvar(produto);
		return (produto != null);
	}
	
	public boolean remover(Produto produto) {
		produto = repo.remover(produto);
		return (produto != null);
	}
}