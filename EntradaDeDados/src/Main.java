import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Exemplo 1
//		String x;
//		System.out.println("Digite um nome: ");
//		x = sc.next();
		
//		System.out.println("Você digitou: " + x);
		
		// Exemplo 2
//		int x;
//		System.out.println("Digite um número: ");
//		x = sc.nextInt();
		
//		System.out.println("Você digitou: " + x);
		
		// Exemplo 3
//		double x;
//		System.out.println("Digite um número: ");
//		x = sc.nextDouble();
				
//		System.out.println("Você digitou: " + x);
		
		// Exemplo 3
//		char x;
//		System.out.println("Digite um caracter: ");
//		x = sc.next().charAt(0);
						
//		System.out.println("Você digitou: " + x);
		
		// Exemplo 4
//		String x;
//		int y;
//		double z;
		
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
		
//		System.out.println("Dados digitados:");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		// Exemplo 5
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
