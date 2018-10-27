package br.com.cursojava.aula006;

public class AppFolha {

	public static void main(String[] args) {

		Funcionario func = new Funcionario();
		func.setNome("Bagrinho");
		func.setSalarioBase(1000);
		
		Vendedor vend = new Vendedor();
		vend.setNome("");
		vend.setSalarioBase(1000);
		vend.setPercentualComissao(0.05);
		vend.setTotalVendas(50000);
		
		FolhaPagamento folha = new FolhaPagamento();
		folha.imprimir(func);
		folha.imprimir(vend);
	}
}