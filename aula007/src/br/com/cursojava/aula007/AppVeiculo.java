package br.com.cursojava.aula007;

public class AppVeiculo {

	public static void main(String[] args) {

		Veiculo v1 = new Veiculo(1);
		v1.setMarca("Honda");
		v1.setModelo("Civic");
		v1.setAnoFabricacao(2018);
		v1.setAnoModelo(2019);

		Veiculo v2 = new Automovel();
		v2.setMarca("Honda");
		v2.setModelo("Civic");
		v2.setId(1);
		v2.setAnoFabricacao(2018);
		v2.setAnoModelo(2019);

		System.out.println(v1);
		System.out.println(v1.equals(v2));
	}
}