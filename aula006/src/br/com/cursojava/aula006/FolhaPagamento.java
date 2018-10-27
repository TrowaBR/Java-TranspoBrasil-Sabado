package br.com.cursojava.aula006;

public class FolhaPagamento {

	public void imprimir(Funcionario funcionario) {
		System.out.println("##### FOLHA DE PAGAMENTO #####");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salário base: " + funcionario.getSalarioBase());
		System.out.println("Salário líquido: " + funcionario.getSalarioLiquido());
		System.out.println("##############################");
	}

}