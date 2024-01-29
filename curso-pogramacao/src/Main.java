import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULDADO = " + x + " METROS");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d nos e ganha R$ %.2f%n", nome, idade, renda);
		
		System.out.println("Hello Java!");
		System.out.print("Bom dia!");
		System.out.printf("Boa noite!");
	}

}
