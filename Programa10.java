/* Faça um programa para gerar automaticamente números entre 0..99 de uma cartela
 * de bingo. Sabendo que cada cartela deverá conter 5 linhas de 5 números, gere
 * estes dados de modo a não ter números repetidos dentro das cartelas. O programa
 * deve exibir na tela a cartela gerada.
 */

package com.jonas.matrizes;

import java.util.Random;

public class Programa10 {

	public static void main(String[] args) {
		int[][] cartela = new int[5][5];

		gerarCartela(cartela);
		imprimir(cartela);

	}

	private static void gerarCartela(int[][] cartela) {
		Random gerador = new Random();

		char jaConsta;
		for (int i = 0; i < cartela.length; i++) {
			for (int j = 0; j < cartela.length; j++) {
				do {

					cartela[i][j] = gerador.nextInt(25);

					jaConsta = 'N';

					for ( int k=0; (k<=i) && (jaConsta == 'N'); k++) {

						for (int l=0; ((k<i && l<cartela.length) || (k==i && l<j)) && (jaConsta == 'N'); l++){

							if (cartela[i][j] == cartela[k][l])

								jaConsta = 'S';
						}
					}

				} while (jaConsta == 'S');
			}

		}
	}

	private static void imprimir(int[][] cartela) {
		for (int i = 0; i < cartela.length; i++) {
			System.out.println();
			for (int j = 0; j < cartela.length; j++) {
				System.out.print(cartela[i][j] + " ");
			}
		}

	}

}
