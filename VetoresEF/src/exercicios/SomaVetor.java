package exercicios;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.print("\nVALORES = ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();

	}

}
