package com.lobao.java;

import java.util.Scanner;

public class EP1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("\nPOSITIVO");
		} else {
			System.out.println("\nNEGATIVO");
		}
		
		sc.close();

	}

}
