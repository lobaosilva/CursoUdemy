package com.lobao.java;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		// Sintaxe / regra
		// for (início; condição; incremento) {
		//   comando 1
		//   comando 2
		// }
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão lidos: ");
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número inteiro: ");
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("\nSOMA = " + soma);
		
		sc.close();

	}

}
