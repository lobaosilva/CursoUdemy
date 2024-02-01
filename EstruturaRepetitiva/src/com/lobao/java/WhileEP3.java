package com.lobao.java;

import java.util.Scanner;

public class WhileEP3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.print("Digite o código do combustível: ");
		x = sc.nextInt();
		
		while (x != 4) {
			if (x == 1) {
				alcool++;
			} else if (x == 2) {
				gasolina++;
			} else if (x == 3) {
				diesel++;
			}
			
			System.out.print("Digite o código do combustível: ");
			x = sc.nextInt();
			
		}
		
		System.out.println("\nMUITO OBRIGADO\n");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		System.out.println("\nFim da execução.\n");
		
		sc.close();

	}

}
