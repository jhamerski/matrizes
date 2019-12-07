/* Gerar e imprimir uma matriz de tamanho 10X10, onde seus elementos são da forma:
 * A[i][j] = 2i + 7j - 2 se i < j
 * A[i][j] = 3i² - 1 se i = j
 * A[i][j] = 4i³ -5j² + 1 se i > j	
 */

package com.jonas.matrizes;

public class Programa07 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];

		preencherMatriz(matriz);
		mostrarMatriz(matriz);
	}

	private static void preencherMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i < j) {
					matriz[i][j] = ((2 * i) + (7 * j) - 2);
				}
				if (i == j) {
					matriz[i][j] = ((3 * (i ^ 2)) - 1);
				}
				if (i > j) {
					matriz[i][j] = ((4 * (i ^ 3)) - (5 * (j ^ 2)) + 1);
				}

			}
		}

	}

	private static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}

}
