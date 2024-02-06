package com.lobao.java;

import java.util.Scanner;

public class ForEP2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão lidos: ");
		int N = sc.nextInt();
		System.out.println();
		
		int in = 0, out = 0;
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número inteiro: ");
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.printf("%n%d in", in);
		System.out.printf("%n%d out", out);
		
		sc.close();

	}

}
