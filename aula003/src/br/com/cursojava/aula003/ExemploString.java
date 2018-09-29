package br.com.cursojava.aula003;

public class ExemploString {

	public static void main(String[] args) {

		String curso = "Curso Java TranspoBrasil Sábado";

		System.out.println("Texto: " + curso);
		System.out.println("Caractéres: " + curso.length());
		System.out.println("Caractéres sem espaço: " + curso.replace(" ", "").length());
		System.out.println();
		System.out.println("Contêm 'TranspoBrasil': " + curso.contains("TranspoBrasil"));
		System.out.println("Inicia com 'Curso': " + curso.startsWith("Curso"));
		System.out.println("Termina com 'Domingo': " + curso.endsWith("Domingo"));
		System.out.println();
		System.out.println("Primeiro 'a': " + curso.indexOf("a"));
		System.out.println("'a' após 10: " + curso.indexOf("a", 10));
		System.out.println("Último 'a': " + curso.lastIndexOf("a"));
		System.out.println();
		System.out.println("Maiúsculo: " + curso.toUpperCase());
		System.out.println("Minúsculo: " + curso.toLowerCase());
		System.out.println();
		System.out.println("Parte '11-*': " + curso.substring(11));
		System.out.println("Parte '0-11': " + curso.substring(0, 11)); // Não inclui o 11 (0-10)
		System.out.println("Caractére '4': " + curso.charAt(4));
		System.out.println();

		String s1 = "João";
		String s2 = "João";
		String s3 = new String("João");
		System.out.println("s1 = s2: " + (s1 == s2));
		System.out.println("s1 = s3: " + (s1 == s3));
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		System.out.println("s1 equalsIgnoreCase 'JOÃO': " + s1.equalsIgnoreCase("JOÃO"));
		System.out.println();

		String texto = "       oi       ";
		System.out.println("Texto: " + texto);
		System.out.println("Trim: " + texto.trim());
		System.out.println();

		String registro = "contato;contato@teste.com;33221100";
		for (String campo : registro.split(";")) {
			System.out.println("Registro: " + campo);
		}
	}
}
