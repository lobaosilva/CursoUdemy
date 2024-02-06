package com.lobao.java;

import java.util.Scanner;

public class ForEP3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de casos: ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.print("\nDigite o primeiro valor: ");
			double a = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double b = sc.nextDouble();
			System.out.print("Digite o terceiro valor: ");
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%nMedia Ponderada = %.1f%n", media);
			
		}
		
		sc.close();

	}

}
