/* Leia duas matrizes 4X4, escreva uma terceira com os maiores valores de cada
 * posição das matrizes lidas.
 */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa06 {

	private static Scanner teclado;

	public static void main(String[] args) {

		int[][] matriz1 = new int[4][4];
		int[][] matriz2 = new int[4][4];

		lerElementos(matriz1, matriz2);
		compararMatrizes(matriz1, matriz2);
	}

	private static void lerElementos(int[][] matriz1, int[][] matriz2) {
		teclado = new Scanner(System.in);

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.println("Matriz 1 - Elemento " + (j + 1) + " :");
				matriz1[i][j] = teclado.nextInt();
			}
		}
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.println("Matriz 2 - Elemento " + (j + 1) + " :");
				matriz2[i][j] = teclado.nextInt();
			}
		}

	}
	
	private static void compararMatrizes(int[][] matriz1, int[][] matriz2) {
		int[][] matrizAux = new int[matriz1.length][matriz2.length];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				if(matriz1[i][j] > matriz2[i][j]) {
					matrizAux[i][j] = matriz1[i][j];
				}else {
					matrizAux[i][j] = matriz2[i][j];
				}
			}
		}
		
		System.out.println(matrizAux.length);
		
		mostrarMatrizes(matriz1, matriz2, matrizAux);
		
	}

	private static void mostrarMatrizes(int[][] matriz1, int[][] matriz2, int[][] matrizAux) {
		System.out.println("Matriz 1!");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz1.length; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println("Matriz 2!");
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println("Matriz resultado!");
		for (int i = 0; i < matrizAux.length; i++) {
			System.out.println();
			for (int j = 0; j < matrizAux.length; j++) {
				System.out.print(matrizAux[i][j] + " ");
			}
		}
	}

}
