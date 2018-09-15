package br.com.cursojava.aula001;

public class Exercicio07 {

	public static void main(String[] args) {
		int diametro = 20;
		double raio = diametro/2;
		
		System.out.printf("%.0f² (raio²) * %.4f (PI) = %.4f (área)",raio,Math.PI, raio*raio*Math.PI);
	}

}
