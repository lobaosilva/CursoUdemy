import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, metroQuadrado;
		
		System.out.print("Informe a largura: ");
		largura = sc.nextDouble();
		System.out.print("Informe o comprimento: ");
		comprimento = sc.nextDouble();
		System.out.print("Informe o metro quadrado: ");
		metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("%nAREA = %.2f m²%n", area);
		System.out.printf("PRECO = R$ %.2f%n", preco);
		
		sc.close();

	}

}
