/* Declare uma matriz 5X5. Preencha com 1 a diagona principal e com 0 os demais
 * elementos. Escreva ao final a matriz obtida.
 */

package com.jonas.matrizes;

public class Programa02 {
	
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		inserirElementos(matriz);
		matrizObtida(matriz);

	}

	private static void inserirElementos(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j) {
					matriz[i][j] = 1;
				}else {
					matriz[i][j] = 0;
				}
			}
		}
		
	}
	
	private static void matrizObtida(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
	}

}
