package com.lobao.java;

import java.util.Scanner;

public class EP5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double total;
		
		System.out.print("Digite o código do produto: ");
		cod = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		qtd = sc.nextInt();
		
		if (cod == 1) {
			total = qtd * 4.0;
		} else if (cod == 2) {
			total = qtd * 4.5;
		} else if (cod == 3) {
			total = qtd * 5.0;
		} else if (cod == 4) {
			total = qtd * 2.0;
		} else {
			total = qtd * 1.5;
		}
		
		System.out.printf("%ntotal: R$ %.2f", total);
		
		sc.close();

	}

}
