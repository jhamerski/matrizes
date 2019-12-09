/* Leia uma matriz 3X3 e calcule:
 * a) A soma dos elementos que estão acima na diagonal principal.
 * b) A soma dos elementos que estão abaixo na diagonal principal.
 * c) A soma dos elementos que estão na diagonal principal.
 * d) A soma dos elementos que estão na diagonal secundária.
 * e) A matriz transposta.
 */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa08 {

	private static Scanner teclado;

	public static void main(String[] args) {

		int[][] matriz = new int[2][2];

		lerElementos(matriz);
		imprimir(matriz);
		
		//a
		acimaDp(matriz);
		
		//b
		abaixoDp(matriz);
		
		//c
		diagonalPrincipal(matriz);
		
		//d
		diagonalSecundaria(matriz);
		
		//e
		transposta(matriz);
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
	
	private static void acimaDp(int[][] matriz) {
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(j > i) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Soma ACIMA da Diagonal Principal: " + soma);
	}
	
	private static void abaixoDp(int[][] matriz) {
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i > j) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Soma ABAIXO da Diagonal Principal: " + soma);	
	}
	
	private static void diagonalPrincipal(int[][] matriz) {
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Soma da DIAGONAL PRINCIPAL: " + soma);	
	}
	
	private static void diagonalSecundaria(int[][] matriz) {
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if((i + j) == (matriz.length - 1)) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Soma da DIAGONAL SECUNDÁRIA: " + soma);	
	}
	
	private static void transposta(int[][] matriz) {
		int[][] transposta = new int[matriz.length][matriz.length];
		System.out.println("TRANSPOSTA:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				if(i > j || j > i) {
					transposta[i][j] = matriz[j][i];
				}else if(i == j){
					transposta[i][j] = matriz[i][j];
				}
			}
		}
		imprimir(transposta);
	}

}
