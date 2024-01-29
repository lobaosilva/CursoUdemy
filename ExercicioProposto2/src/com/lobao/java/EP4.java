package com.lobao.java;

import java.util.Scanner;

public class EP4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hInicial, hFinal, duracao;
		
		System.out.print("Digite a hora de inicio: ");
		hInicial = sc.nextInt();
		System.out.print("Digite a hora de termino: ");
		hFinal = sc.nextInt();
		
		if (hInicial < hFinal) {
			duracao = hFinal - hInicial;
		} else {
			duracao = 24 - hInicial + hFinal;
		}
		
		System.out.println("\nO JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
