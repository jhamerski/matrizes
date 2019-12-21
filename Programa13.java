/* Faça um programa que leia uma matriz de 5 linhas e 4 colunas contendo as 
 * seguintes informações sobre os alunos de uma disciplina!
 * - Primeira coluna: número de matrícula.
 * - Segunda coluna: média das provas.
 * - Terceira coluna: média dos trabalho.
 * - Quarta coluna: nota final.
 * 
 * ELABORE UM PROGRAMA QUE:
 * a) Leia as 3 primeiras informações de cada aluno.
 * b) Calcule a nota final soma média (provas e trabalhos)
 * c) Imprima a média aritmética das notas finais.
 */

package com.jonas.matrizes;

import java.util.Scanner;

public class Programa13 {

	private static Scanner teclado;

	public static void main(String[] args) {
		float[][] matriz = new float[5][4];

		// a
		lerTresInformacoes(matriz);

		// b
		mediaFinal(matriz);

		// c
		mediaAritmeticaNotasFinais(matriz);

	}

	private static void lerTresInformacoes(float[][] matriz) {

		lerMatriculas(matriz);
		mediaProvas(matriz);
		mediaTrabalhos(matriz);

	}

	private static void lerMatriculas(float[][] matriz) {
		teclado = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Informe a matrícula do aluno " + (i + 1) + " :");
				if (j == 0) {
					matriz[i][j] = teclado.nextInt();
					break;
				}
			}
		}
	}

	private static void mediaProvas(float[][] matriz) {
		teclado = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 1) {
					System.out.println("Informe a média das provas " + (i + 1) + " :");
					matriz[i][j] = teclado.nextInt();
					if(matriz[i][j] < 0 || matriz[i][j] > 10) {
						System.out.println("Nota inválida!");
						i--;
					}
					break;
				}
			}
		}

	}

	private static void mediaTrabalhos(float[][] matriz) {
		teclado = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					System.out.println("Informe a média dos trabalhos " + (i + 1) + " :");
					matriz[i][j] = teclado.nextInt();
					if(matriz[i][j] < 0 || matriz[i][j] > 10) {
						System.out.println("Nota inválida!");
						i--;
					}
					break;
				}
			}
		}

	}

	private static void mediaFinal(float[][] matriz) {
		float soma = 0;
		int divisor = 0;
		for (int i = 0; i < 5; i++) {
			soma = 0;
			divisor = 0;
			for (int j = 0; j < 4; j++) {
				if (j == 1 || j == 2) {
					divisor++;
					soma = soma + matriz[i][j];
					if (divisor == 2) {
						soma = (soma / 2);
						matriz[i][j + 1] = soma;
						System.out.println("Média final do aluno " + (i + 1) + " foi de: " + soma);
					}
				}
			}
		}

	}

	private static void mediaAritmeticaNotasFinais(float[][] matriz) {
		float aux = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 3) {
					aux = (aux + matriz[i][j]);
				}
			}
		}

		aux = aux / 5;
		System.out.println("A média Aritmética das notas finais foi de " + aux);
	}

}
