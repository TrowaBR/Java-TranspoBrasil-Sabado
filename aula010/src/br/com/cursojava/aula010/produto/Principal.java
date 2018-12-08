package br.com.cursojava.aula010.produto;

import java.util.List;

import br.com.cursojava.aula010.utils.JPAUtil;

public class Principal {

	public static void main(String[] args) {
		RepositorioProduto daoProduto = new RepositorioProduto();
		
		List<Produto> lista = daoProduto.buscarPorValor(10, 20);
		System.out.println(lista);
		JPAUtil.closeEmf();
	}
}