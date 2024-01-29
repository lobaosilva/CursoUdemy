package com.lobao.java;

import java.util.Scanner;

public class EP1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();
		System.out.print("Digite outro número inteiro: ");
		y = sc.nextInt();
		
		soma = x + y;
		System.out.print("\nSOMA = " + soma);
		
		sc.close();

	}

}
