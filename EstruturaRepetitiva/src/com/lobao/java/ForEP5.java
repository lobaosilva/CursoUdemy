package com.lobao.java;

import java.util.Scanner;

public class ForEP5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		int fat = 1;
		
		for (int i = 1; i <= n; i++) {
			
			fat = fat * i;
			
		}
		
		System.out.println("\nSeu número fatorial é: " + fat);
		
		sc.close();

	}

}
