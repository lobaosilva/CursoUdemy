package com.lobao.java;

import java.util.Scanner;

public class EP2 {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("\nPAR");
		} else {
			System.out.println("\nIMPAR");
		}
		
		sc.close();

	}

}
