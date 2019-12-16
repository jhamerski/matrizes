/* Leia uma matriz 5x10 que se refere resposta de 10 questões de múltipla escolha, referente
 * a 5 alunos, leia também um vetor de 10 posições contendo o gabarito de respostas que podem
 * ser A, B, C, D. Seu programa deverá comparar as respostas de cada candidato com o gabarito..
 */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa11 {

	private static Scanner teclado;

	public static void main(String[] args) {

		String[][] questoes = new String[2][10];
		String[] gabarito = { "a", "b", "a", "d", "c", "b", "c", "d", "a", "c" };

		lerRespostas(questoes, gabarito);
		comparargabarito(questoes, gabarito);

	}

	private static void lerRespostas(String[][] questoes, String[] gabarito) {
		teclado = new Scanner(System.in);
		for (int i = 0; i < questoes.length; i++) {
			System.out.println("Aluno " + (i + 1));
			for (int j = 0; j < gabarito.length; j++) {
				System.out.println("Resposta " + (j + 1) + " :");
				questoes[i][j] = teclado.nextLine();
				if (questoes[i][j].equals("a") || questoes[i][j].equals("b") || questoes[i][j].equals("c") || questoes[i][j].equals("d")) {
				} else {
					System.out.println("Respota inválida!");
					System.out.println("Digite novamente a Resposta " + (j + 1) + " :");
					j--;

				}
			}
		}

	}

	private static void comparargabarito(String[][] questoes, String[] gabarito) {
		int acertos = 0;

		for (int i = 0; i < questoes.length; i++) {
			acertos = 0;
			System.out.println();
			System.out.println("Aluno " + (i + 1));
			for (int j = 0; j < gabarito.length; j++) {
				if (questoes[i][j].equals(gabarito[j])) {
					acertos++;
					System.out.print(acertos + " ");
				}
			}
		}

	}

}
