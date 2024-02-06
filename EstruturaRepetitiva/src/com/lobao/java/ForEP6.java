package com.lobao.java;

import java.util.Scanner;

public class ForEP6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		System.out.println("\nSeus divisores são:\n");
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) {
				
				System.out.println(i);
				
			}
			
		}
		
		sc.close();

	}

}
