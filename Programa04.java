/* Leia uma matriz 4X4, imprima a matriz e retorne a localização (linha, coluna)
 * do maior valor.
 */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa04 {

	private static Scanner teclado;

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		inserirElementos(matriz);
		mostraMatriz(matriz);

	}

	private static void inserirElementos(int[][] matriz) {
		teclado = new Scanner(System.in);

		int maior = 0, linha = 0, coluna = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Elemento " + (j + 1) + " :");
				matriz[i][j] = teclado.nextInt();
				if (i == 0 && j == 0) {
					maior = matriz[i][j];
					linha = (i + 1);
					coluna = (j + 1);
				}
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = (i + 1);
					coluna = (j + 1);
				}
			}
		}

		System.out.println("O maior elemento é " + maior);
		System.out.println("Esta na linha " + linha + " e coluna " + coluna + " .");

	}

	private static void mostraMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}

}
