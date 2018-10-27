package br.com.cursojava.aula006;

public class Vendedor extends Funcionario {

	private double percentualComissao;
	private double totalVendas;

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		if (percentualComissao > 1)
			percentualComissao /= 100;

		this.percentualComissao = percentualComissao;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getComissao() {
		return getTotalVendas() * getPercentualComissao();
	}
	
	@Override
	public double getBaseInss() {
		return super.getBaseInss() + getComissao();
	}
	
	@Override
	public double getSalarioLiquido() {
		return super.getSalarioLiquido() + getComissao();
	}
}