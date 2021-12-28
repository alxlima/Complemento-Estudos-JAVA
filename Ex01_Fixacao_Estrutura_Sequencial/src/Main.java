import java.util.Locale;




public class Main {

	public static void main(String[] args) {
	
		String product1 ="computer";
		String product2 ="office desk";
		
		byte age = 30;
		int code = 5290;
		char gender ='F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("=== Meu Resultado ========");
		System.out.println();
		System.out.println("Products:");
		
		System.out.printf("Computer, which price is $ %.2f%n", price1);
		System.out.printf("office desk, which price is $ %.2f%n", price2);
		
		System.out.println();
		System.out.println("1- Record: "+ age + " years old, code "+ code + " and gender: "+ gender );
		System.out.printf("2- Record: %d years old, code %d and gender: %c%n ",age,code,gender );
		
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n ",measure );
		System.out.printf("Rounded (three decimal places): %.3f%n ",measure );

		
		Locale.setDefault(Locale.US);// transformo formta , para . no valor impresso.
		System.out.printf("US decimal point: %.3f%n ",measure );
		
	
		System.out.println();
		System.out.println("=== Resposta Aula========");
		System.out.println();
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		

	}

}
