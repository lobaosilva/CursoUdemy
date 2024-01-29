package com.lobao.java;

import java.util.Scanner;

public class EP7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Digite um número: ");
		x = sc.nextDouble();
		System.out.print("Digite outro número: ");
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("\nOrigem");
		} else if (x == 0.0) {
			System.out.println("\nEixo Y");
		} else if (y == 0.0) {
			System.out.println("\nEixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("\nQ1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("\nQ2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("\nQ3");
		} else {
			System.out.println("\nQ4");
		}
		
		sc.close();

	}

}
