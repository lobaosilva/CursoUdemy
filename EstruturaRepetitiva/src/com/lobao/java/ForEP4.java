package com.lobao.java;

import java.util.Scanner;

public class ForEP4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número de pares: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("\nDigite o primeiro valor: ");
			double a = sc.nextDouble();
			System.out.print("Digite o primeiro valor: ");
			double b = sc.nextDouble();
			
			double div = 0;
			if (b != 0) {
				div = a / b;
				System.out.printf("%n%.1f%n", div);
			} else {
				System.out.println("\nDivisão Impossível!");
			}
			
		}
		
		sc.close();
		
	}

}
