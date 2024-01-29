package com.lobao.java;

import java.util.Scanner;

public class EP5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, n1, cod2, n2;
		double vu1, vu2, total;
		
		System.out.print("Digite o código da peça: ");
		cod1 = sc.nextInt();
		System.out.print("Digite o número de peças: ");
		n1 = sc.nextInt();
		System.out.print("Digite o valor unitário: ");
		vu1 = sc.nextDouble();
		
		System.out.print("Digite o código da peça: ");
		cod2 = sc.nextInt();
		System.out.print("Digite o número de peças: ");
		n2 = sc.nextInt();
		System.out.print("Digite o valor unitário: ");
		vu2 = sc.nextDouble();
		
		total = (n1 * vu1) + (n2 * vu2);
		System.out.printf("%nVALOR A PAGAR: R$ %.2f", total);
		
		sc.close();

	}

}
