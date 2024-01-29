package com.lobao.java;

import java.util.Scanner;

public class Aula37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Minutos consumidos: ");
		int min = sc.nextInt();
		
		double conta = 50.0;
		if (min > 100) {
			conta += (min - 100) * 2.0;
		}
		
		System.out.printf("\nValor da conta = R$  %.2f", conta);
		
		sc.close();
		
	}

}
