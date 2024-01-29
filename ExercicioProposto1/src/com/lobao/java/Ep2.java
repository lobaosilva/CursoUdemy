package com.lobao.java;

import java.util.Scanner;

public class Ep2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double area, raio, pi = 3.14159;
		
		System.out.print("Digite o raio: ");
		raio = sc.nextDouble();
		
		area = pi * (Math.pow(raio, 2.0));
		
		System.out.printf("%nArea = %.4f", area);
		
		sc.close();

	}

}
