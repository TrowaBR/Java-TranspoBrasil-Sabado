package br.com.cursojava.aula011web.cliente;

import java.util.List;

public class FacadeCliente {

	private RepositorioCliente repo = new RepositorioCliente();

	public List<Cliente> carregarTodos() {
		return repo.buscarTodos();
	}

	public Cliente novoCliente() {
		return new Cliente();
	}

	public Cliente buscarPorId(Integer id) {
		return repo.buscarPorId(id);
	}

	public boolean salvar(Cliente cliente) {
		cliente = repo.salvar(cliente);
		return (cliente != null);
	}
	
	public boolean remover(Cliente cliente) {
		cliente = repo.remover(cliente);
		return (cliente != null);
	}
}