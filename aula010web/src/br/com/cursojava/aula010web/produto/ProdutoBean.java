package br.com.cursojava.aula010web.produto;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProdutoBean {

	private FacadeProduto facade = new FacadeProduto();
	private List<Produto> produtos = null;
	
	public List<Produto> getProdutos() {
		if (produtos == null || produtos.isEmpty()) {
			produtos = facade.carregarProdutos();
		}
		return this.produtos;
	}
}
