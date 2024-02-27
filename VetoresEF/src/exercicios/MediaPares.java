package exercicios;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantoos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		int somaPares = 0;
		int nPares = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				somaPares += vetor[i];
				nPares++;
			}
		}
		
		double mediaPares;
		if (nPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaPares = (double)somaPares / nPares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		}
		
		sc.close();

	}

}
