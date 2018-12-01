package br.com.cursojava.exercicio;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Produto> lista = RepositorioProduto.buscarPorPreco(1000,2000);
		for (Produto p : lista) {
			System.out.println(p);
		}
	}
}