package br.com.cursojava.aula008;

import java.util.List;

public class RepositorioContatoTest {

	public static void main(String[] args) {
		testarContar();
	}
	
	private static void testeInserir() {
		Contato contato = new Contato(null, "Bagrinho", "b@teste.com", "33221100");
		
		RepositorioContato repositorio = new RepositorioContato();
		
		repositorio.inserir(contato);
		System.out.println(contato);
	}
	
	private static void testarListarTodos() {
		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> buscarTodos = repositorio.buscarTodos();

		System.out.println("===============================");
		System.out.println("LISTAR TODOS");
		System.out.println("===============================");
		for (Contato contato : buscarTodos) {
			System.out.println(contato);
		}
	}

	private static void testarBuscarPorId() {
		RepositorioContato repositorio = new RepositorioContato();

		System.out.println("===============================");
		System.out.println("BUSCAR POR ID");
		System.out.println("===============================");
		System.out.println(repositorio.buscarPorId(1));
		System.out.println(repositorio.buscarPorId(5000));
	}

	private static void testarAtualizar() {
		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorId(1);
		contato.setNome("Bagrinha do Silva Brasil");
		repositorio.atualizar(contato);
		contato = repositorio.buscarPorId(1);
		System.out.println(contato);
	}

	private static void testarRemover() {
		RepositorioContato repositorio = new RepositorioContato();

		System.out.println("===============================");
		System.out.println("REMOVER");
		System.out.println("===============================");
		repositorio.remover(1);
		System.out.println(repositorio.buscarPorId(5000));
	}

	private static void testarContar() {
		RepositorioContato repositorio = new RepositorioContato();

		System.out.println("===============================");
		System.out.println("CONTAR");
		System.out.println("===============================");
		System.out.println(repositorio.contar());
	}

}