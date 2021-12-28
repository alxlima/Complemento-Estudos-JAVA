import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//int y = 32;
		double x = 10.35784;
		String nome = "Maria"; 
		int idade = 31;
		double renda = 4000.0;
		
		//System.out.println(y);
		System.out.println(x);
		System.out.printf(" %.2f", x); // %2.f-- Padrão mascara duas casas e arendondamento após virgula.
		System.out.printf(" %.4f", x); // %4.f-- Padrão mascara quatro  casas e arendondamento após virgula.
		
		Locale.setDefault(Locale.US); //[ local.us ] - Eu substituo [.] no valor fracionado onde caracter [,]; 
		System.out.printf(" %.4f", x); 
		
		System.out.println(" RESULTADO = " + x + " METROS");
		System.out.printf(" RESULTADO = %.2f  METROS%n", x);
		System.out.println(" Ola mundo !");

		

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
