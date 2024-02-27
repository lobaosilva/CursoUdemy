package exercicios;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] =sc.nextDouble();
		}
		
		int nmenores = 0;
		double alturatotal = 0.0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				nmenores++;
			}
			alturatotal += alturas[i];
		}
		
		double alturamedia = alturatotal / n;
		double percentualMenores = ((double)nmenores / n) * 100.0;
		
		System.out.printf("%nAltura media = %.2f%n", alturamedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores);
		
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.printf("%s%n", nomes[i]);
			}
		}
		
		sc.close();

	}

}
