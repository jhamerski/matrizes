/* Leia uma matriz 5X5. Leia também um valor X. O programa deverá fazer uma busca
 * desse valor X na matriz e, ao final, escrever a localização (linha, coluna) ou
 * a mensagem não encontrado.
 */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa05 {

	private static Scanner teclado;

	public static void main(String[] args) {

		int[][] matriz = new int[5][5];

		lerElementos(matriz);
		buscarElemento(matriz);

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

	private static void buscarElemento(int[][] matriz) {
		teclado = new Scanner(System.in);
		int x = 0, linha = 0, coluna = 0, achou = 0;
		System.out.println("Informe um número para buscar na matriz: ");
		x = teclado.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (x == matriz[i][j]) {		
					linha = (i + 1);
					coluna = (j + 1);
					achou = 1;
				}
			}
		}
		
		if(achou == 1) {
			System.out.println("Número " + x + " foi encontrado.");
			System.out.println("Está na linha " + linha + " coluna " + coluna + ".");
		}else {
			System.out.println("Número não encontrado!");
		}
	}

}
