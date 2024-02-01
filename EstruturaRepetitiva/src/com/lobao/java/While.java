package com.lobao.java;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		// Sintaxe / regra
		// while (condicao) {
		//		comando 1
		//		comando 2
		// }
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		int soma = 0;
		while (x!= 0) {
			soma += x;
			System.out.print("Digite outro número inteiro: ");
			x = sc.nextInt();
		}
		
		System.out.printf("%nSOMA = %d", soma);
		
		sc.close();

	}

}
