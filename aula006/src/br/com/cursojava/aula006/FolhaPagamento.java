package br.com.cursojava.aula006;

public class FolhaPagamento {

	public void imprimir(Funcionario funcionario) {
		System.out.println("##### FOLHA DE PAGAMENTO #####");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Sal�rio base: " + funcionario.getSalarioBase());
		System.out.println("Sal�rio l�quido: " + funcionario.getSalarioLiquido());
		System.out.println("##############################");
	}

}