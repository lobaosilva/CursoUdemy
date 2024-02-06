package com.lobao.java;

import java.util.Scanner;

public class ForEP1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro de 1 à 1000: ");
		int x = sc.nextInt();
		
		System.out.println("\nNúmeros Ímpares:\n");
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
