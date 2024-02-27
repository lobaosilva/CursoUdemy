package exercicios;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("\nDigite os valores do vetor A:");
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("\nDigite os valores do vetor B:");
		
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println("\nVETOR RESULTANTE:");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", c[i]);
		}
		
		sc.close();

	}

}
