package com.lobao.java;

import java.util.Scanner;

public class EP6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi = 3.14159, atr, ac, aTra, aq, ar;
		
		System.out.print("Digite um número decimal: ");
		A = sc.nextDouble();
		System.out.print("Digite outro número decimal: ");
		B = sc.nextDouble();
		System.out.print("Digite outro número decimal: ");
		C = sc.nextDouble();
		
		// Área do triângulo retângulo
		atr = (A * C) / 2.0;
		
		// Área do círculo
		ac = pi * (Math.pow(C, 2.0));
		
		// Área do trapézio
		aTra = ((A + B) * C) / 2.0;
		
		// Área do quadrado
		aq = Math.pow(B, 2.0);
		
		// Área do retângulo
		ar = A * B;
		
		System.out.printf("%nTRIÂNGULO: %.3f", atr);
		System.out.printf("%nCÌRCULO:   %.3f", ac);
		System.out.printf("%nTRAPÉZIO:  %.3f", aTra);
		System.out.printf("%nQUADRADO:  %.3f", aq);
		System.out.printf("%nRETÂNGULO: %.3f", ar);
		
		sc.close();

	}

}
