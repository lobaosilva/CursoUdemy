package com.lobao.java;

import java.util.Scanner;

public class EP6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n;
		
		System.out.print("Digite um número decimal: ");
		n = sc.nextDouble();
		
		if (n < 0.0 || n > 100.0) {
			System.out.println("\nFora de intervalo");
		} else if (n <= 25.0) {
			System.out.println("\nIntervalo [0, 25]");
		} else if (n <= 50.0) {
			System.out.println("\nInvervalo [25,50]");
		} else if (n <= 75.0) {
			System.out.println("\nIntervalo [50, 75]");
		} else {
			System.out.println("\nIntervalo [75, 100]");
		}
		
		sc.close();

	}

}
