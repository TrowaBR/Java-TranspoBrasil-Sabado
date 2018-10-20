package br.com.cursojava.aula005;

public class ContatoController {

	Contato[] lista = new Contato[50];
	int quantidade = 0;

	public void criarContato(String nome, String email, String telefone) {
		if (quantidade < lista.length) {
			Contato contato = new Contato();
			contato.nome = nome;
			contato.email = email;
			contato.telefone = telefone;
			lista[quantidade++] = contato;
			System.out.println("Contato cadastrado com sucesso!");
		} else {
			System.out.println("Limite de contatos ultrapassado!");
		}
	}

	public int totalContatos() {
		return quantidade;
	}

	public Contato buscarContato(int idx) {
		if (idx >= 0 && idx < quantidade) {
			return lista[idx];
		} else {
			return null;
		}
	}
}