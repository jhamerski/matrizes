/* Faça um programa que leia uma matriz 3X6 com valores reais
 * a) Imprima a soma de todos os elementos da colunas ímpares.
 * b) Imprima a média artimética dos elementos da segunda e quarta colunas.
 * c) Substitua os valores da sexta coluna pelas soma dos valores das colunas 1 e 2.
 * d) Imprima a matriz modificada.
 */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa14 {

	private static Scanner teclado;

	public static void main(String[] args) {
		float[][] matriz = new float[3][6];

		lerElementos(matriz);
		imprimirOriginal(matriz);

		// a
		somaColunasImpares(matriz);

		// b
		mediaAritmetica(matriz);

		// c
		substituindoValores(matriz);

		// d
		imprimirModificada(matriz);

	}

	private static void lerElementos(float[][] matriz) {
		teclado = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			if (i > 0)
				System.out.println();
			for (int j = 0; j < 6; j++) {
				System.out.println("Informe o elemento " + (j + 1) + " - Linha " + (i + 1) + ":");
				matriz[i][j] = teclado.nextFloat();
			}
		}

	}

	private static void imprimirOriginal(float[][] matriz) {
		System.out.println("Matriz Original!");
		for (int i = 0; i < matriz.length; i++) {
			if (i > 0)
				System.out.println();
			for (int j = 0; j < 6; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

	}

	private static void somaColunasImpares(float[][] matriz) {
		float result = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < 6; j++) {
				if (j % 2 != 0) {
					result = result + matriz[i][j];
				}
			}
		}

		System.out.println();
		System.out.println("A soma dos elementos das colunas ímpares é de: " + result);

	}

	private static void mediaAritmetica(float[][] matriz) {
		float result = 0;
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 1 || j == 3) {
					result = result + matriz[i][j];
					count++;
				}
			}
		}
		result = result / count;

		System.out.println();
		System.out.println("A média Aritmética das colunas 2 e 4 são: " + result);
	}

	private static void substituindoValores(float[][] matriz) {
		float result = 0;
		for (int i = 0; i < matriz.length; i++) {
			result = 0;
			for (int j = 0; j < 6; j++) {
				if (j == 0 || j == 1) {
					result = result + matriz[i][j];
					matriz[i][j + 4] = result;
				}
			}
		}

	}

	private static void imprimirModificada(float[][] matriz) {
		System.out.println();
		System.out.println("Matriz Modificada!");
		for (int i = 0; i < matriz.length; i++) {
			if (i > 0)
				System.out.println();
			for (int j = 0; j < 6; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

	}

}
