/* Leia uma matriz 4X4, conte e escreva quantos valores maior que 10 ela possui.
 */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa01 {

	private static Scanner teclado;

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];

		lerElementos(matriz);
		matrizOriginal(matriz);
		mostrarElementos(matriz);

	}

	private static void lerElementos(int[][] matriz) {
		teclado = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Elementos " + (j + 1) + " :");
				matriz[i][j] = teclado.nextInt();
			}
		}
	}

	private static void matrizOriginal(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}

	private static void mostrarElementos(int[][] matriz) {

		int contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > 10) {
					contador++;
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Temos " + contador + "número(s) maior(es) que 10.");

	}

}
