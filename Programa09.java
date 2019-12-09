/* Gere uma matriz 4X4 com valores no intervalo [1..20]. Escreva um programa que
 * transforme a matriz gerada em uma matriz triangular inferior, ou seja, atribuindo
 * zero a todos os elementos acima da diagonal princinpal. Imprima as duas matrizes.
 */

package com.jonas.matrizes;

import java.util.Random;

public class Programa09 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		gerarMatriz(matriz);
		imprimir(matriz);
		triangular(matriz);

	}

	private static void gerarMatriz(int[][] matriz) {
		Random gerador = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = gerador.nextInt(20) + 1;
			}
		}
	}

	private static void imprimir(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
	
	private static void triangular(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(j > i) {
					matriz[i][j] = 0;
				}
			}
		}
		System.out.println();
		imprimir(matriz);
	}

}
