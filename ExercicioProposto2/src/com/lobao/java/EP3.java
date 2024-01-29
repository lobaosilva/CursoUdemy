package com.lobao.java;

import java.util.Scanner;

public class EP3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.print("Digite um número: ");
		A = sc.nextInt();
		System.out.print("Digite outro número: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A ==0) {
			System.out.println("\nSão Múltiplos");
		} else {
			System.out.println("\nNão São Múltiplos");
		}
		
		sc.close();

	}

}
