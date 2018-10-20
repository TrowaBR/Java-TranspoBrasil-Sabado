package br.com.cursojava.aula005;

public class UsoLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.potencia = 100;
		lampada.setTipo ("Incandecente");
		
		System.out.println(lampada.potencia);
		System.out.println(lampada.tipo);
		
		lampada.ligar();
	}
}
