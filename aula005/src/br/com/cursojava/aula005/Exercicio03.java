package br.com.cursojava.aula005;

public class Exercicio03 {

	public static void main(String[] args) {

		int[][] matriz = {{10,9, 8, 7},
						  {6, 5, 4, 3},
		  		  	 	  {2, 1, 2, 3},
		  		  	 	  {4, 5, 6, 7}};

		// Inicialização
		int soma = 0;
		int idxPri;
		int idxSec;
		String diagonalPri = "";
		String diagonalSec = "";
		int[][] matrizMult = new int[matriz.length][];
		int[][] matrizCond = new int[matriz.length][];

		for (int i = 0; i < matriz.length; i++) {
			matrizMult[i] = new int[matriz[i].length];
			matrizCond[i] = new int[matriz[i].length];

			// Busca diagonal principal
			idxPri = i;
			if (idxPri >= 0 && idxPri < matriz[i].length) {
				diagonalPri += matriz[i][idxPri] + ", ";
			} else {
				idxPri = -1;
			}

			// Busca diagonal secundária
			idxSec = matriz[i].length - i - 1;
			if (idxSec >= 0 && idxSec < matriz[i].length) {
				diagonalSec += matriz[i][idxSec] + ", ";
			} else {
				idxSec = -1;
			}

			for (int j = 0; j < matriz[i].length; j++) {
				// Soma
				soma += matriz[i][j];

				// Matriz multiplicada
				matrizMult[i][j] = matriz[i][j] * (idxPri >= 0 ? matriz[i][idxPri] : 1);
				
				// Matriz multiplicada condicionalmente
				if (j > idxPri) {
					matrizCond[i][j] = matriz[i][j] * (idxSec >= 0 ? matriz[i][idxSec] : 1);
				} else if (j == idxPri) {
					matrizCond[i][j] = matriz[i][j] * matriz[i][j] * matriz[i][j];
				} else {
					matrizCond[i][j] = matrizMult[i][j];
				}
			}
		}

		diagonalPri = diagonalPri.substring(0, diagonalPri.length() - 2) + ".";
		diagonalSec = diagonalSec.substring(0, diagonalSec.length() - 2) + ".";

		System.out.println("a) " + soma + ".");
		System.out.println("b) " + diagonalPri);
		System.out.println("c) " + diagonalSec);
		System.out.println("d)");

		for (int[] linha : matrizMult) {
			System.out.print("{ ");
			for (int coluna : linha) {
				System.out.printf("%3d ", coluna);
			}
			System.out.println("}");
		}

		System.out.println("e)");

		for (int[] linha : matrizCond) {
			System.out.print("{ ");
			for (int coluna : linha) {
				System.out.printf("%4d ", coluna);
			}
			System.out.println("}");
		}
	}
}