package br.com.cursojava.aula001;

public class ExemploOperadores {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 2;
		int n3 = 3;
		double n4 = 3;
		
		System.out.printf("%d + %d = %d \n", n1, n2, n1+n2);
		System.out.printf("%d - %d = %d \n", n1, n2, n1-n2);
		System.out.printf("%d * %d = %d \n", n1, n3, n1*n3);
		System.out.printf("%d / %d = %d \n", n1, n3, n1/n3);
		System.out.printf("%d / %f = %f \n", n1, n4, n1/n4);
		System.out.printf("%d %% %d = %d \n", n1, n3, n1%n3);
		System.out.printf("++ %d = %d \n", n1, ++n1);
		System.out.printf("-- %d = %d \n", n1, --n1);
	}
}
