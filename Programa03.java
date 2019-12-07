/* Faça um programa que preenche uma matriz 4X4 com o produto do valor da linha
 * e da coluna de cada elemento. Em seguida imprima na tela a matriz.
 */

package com.jonas.matrizes;

public class Programa03 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		inserirElementos(matriz);
		Imprimir(matriz);

	}

	private static void inserirElementos(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (i + 1) * (j + 1);
			}
		}

	}

	private static void Imprimir(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}

}
