package com.lobao.java;

import java.util.Scanner;

public class WhileEP2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número do Eixo X: ");
		int x = sc.nextInt();
		System.out.print("Digite um número do Eixo Y: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("\nPrimeiro Quadrante");
				System.out.print("\nDigite um número do Eixo X: ");
				x = sc.nextInt();
				System.out.print("Digite um número do Eixo Y: ");
				y = sc.nextInt();
			} else if (x < 0 && y > 0) {
				System.out.println("\nSegundo Quadrante");
				System.out.print("\nDigite um número do Eixo X: ");
				x = sc.nextInt();
				System.out.print("Digite um número do Eixo Y: ");
				y = sc.nextInt();
			} else if (x < 0 && y < 0) {
				System.out.println("\nTerceiro Quadrante");
				System.out.print("\nDigite um número do Eixo X: ");
				x = sc.nextInt();
				System.out.print("Digite um número do Eixo Y: ");
				y = sc.nextInt();
			} else {
				System.out.println("\nQuarto Quadrante");
				System.out.print("\nDigite um número do Eixo X: ");
				x = sc.nextInt();
				System.out.print("Digite um número do Eixo Y: ");
				y = sc.nextInt();
			}
		}
		
		System.out.println("\nFim da execução!");
		
		sc.close();

	}

}
