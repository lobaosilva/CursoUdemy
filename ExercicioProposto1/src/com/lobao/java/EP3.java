package com.lobao.java;

import java.util.Scanner;

public class EP3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		System.out.print("Digite um número: ");
		A = sc.nextInt();
		System.out.print("Digite outro número: ");
		B = sc.nextInt();
		System.out.print("Digite outro número: ");
		C = sc.nextInt();
		System.out.print("Digite outro número: ");
		D = sc.nextInt();
		
		dif = A * B - C * D;
		
		System.out.print("\nDIFERENÇA = " + dif);
		
		sc.close();

	}

}
