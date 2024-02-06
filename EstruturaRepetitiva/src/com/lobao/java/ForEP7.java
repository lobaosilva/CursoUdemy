package com.lobao.java;

import java.util.Scanner;

public class ForEP7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			
			int pri = i;
			int seg = i * i;
			int ter = i * i * i;
			
			System.out.printf("%d %d %d%n", pri, seg, ter);
					
		}
		
		sc.close();

	}

}
