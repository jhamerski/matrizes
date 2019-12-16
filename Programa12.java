/* Faça um programa que permita ao usuário entrar com uma matriz 3X3 números inteiros.
 * Em seguida, gere um array unidimencional pela soma dos números de cada coluna da 
 * matriz e mostrar na tela esse array. Por exemplo:
 * 5  -8  10
 * 1   2  16
 * 25  10  7
 * 
 * Vai gerar um vetor onde cada posição é a soma das colunas da matriz. A primeira
 * posição do array sera: 5 + 1 + 25 = 31, e assim por diante:
 * */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa12 {
	
	private static Scanner teclado;

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		
		lerElementos(matriz);
		imprimir(matriz);
		somarColunas(matriz);

	}

	private static void lerElementos(int[][] matriz) {
		teclado = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Elemento " + (j + 1) + " :");
				matriz[i][j] = teclado.nextInt();
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
	
	private static void somarColunas(int[][] matriz) {
		System.out.println();
		int soma = 0;
		int[] result = new int [matriz.length];
		for (int j = 0; j < matriz.length; j++) {
			soma = 0;
			for (int i = 0; i < matriz.length; i++) {
					soma = soma + matriz[i][j];			
			}
			result[j] = soma;
		}
		mostrarResultados(result);
	}

	private static void mostrarResultados(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println("A soma da coluna " + (i + 1) + " foi: " + result[i]);
		}
	}
	
}
