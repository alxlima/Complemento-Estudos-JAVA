import java.util.Locale;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*# Exemplo 01 -----------------------------------------------------------------------------*/
		/*Para ler variavel String - pego valor do teclado e apresento no terminal console*/
		/*System.out.println("=== Digite um Texto Qualquer ========");
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Voce Digitou:" + x );
		
		sc.close();*/
		
		/*# Exemplo 02 -----------------------------------------------------------------------------*/
		/* Para ler numero Inteiro - pego valor do teclado e apresento no terminal console*/
		/*System.out.println("=== Digite um Numero Qualquer ========");
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		System.out.println("Voce Digitou:" + x );
		
		sc.close();*/
		
		
		/*# Exemplo 03 -----------------------------------------------------------------------------*/
		/* Para ler numero com ponto flutuante - pego valor do teclado e apresento no terminal console*/
		/*System.out.println("=== Digite um Numero com ponto flutuante com virgula Qualquer ========");
		
		//nota para considerar o separador de decimais com ponto, Antes da declaração do Scanner, faça
	    //Locale.setDefault(Locale.US); // neste consigo digitar valor com ponto no lugar de virgulas.
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.println("Voce Digitou:" + x );// println, pega localidade independente usa [ . ]
		System.out.printf("Voce Digitou: %.2f%n" , x );// printf, pega localidade com virgula [ , ]
		
		sc.close();*/
		
		
		/*# Exemplo 04 -----------------------------------------------------------------------------*/
		/*para ler um caractere  - pego valor do teclado e apresento no terminal console*/
		/*System.out.println("=== Digite um caracter unico ========");
		
		//nota para considerar o separador de decimais com ponto, Antes da declaração do Scanner, faça
	    //Locale.setDefault(Locale.US); // neste consigo digitar valor com ponto no lugar de virgulas.
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		
		System.out.println("Voce Digitou:" + x );// println, pega localidade independente usa [ . ]
		// System.out.printf("Voce Digitou: %.2f%n" , x );// printf, pega localidade com virgula [ , ]
		
		sc.close(); */
		
		
		/*# Exemplo 05 -----------------------------------------------------------------------------*/
		/* para ler varios dados na mesma linha  - pego valor do teclado e apresento no terminal console*/
		/*System.out.println("=== Digite varios dados na mesma linha ========");
		System.out.println("=== seguir a ordem - Texto valor inteiro - valor fracionado ========");
		
		//nota para considerar o separador de decimais com ponto, Antes da declaração do Scanner, faça
	    //Locale.setDefault(Locale.US); // neste consigo digitar valor com ponto no lugar de virgulas.
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados Digitados:");// println, pega localidade independente usa [ . ]
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close(); */
		
		
		/*# Exemplo 06 -----------------------------------------------------------------------------*/
		/* Para ler um Até a Quebra de linha- pego valor do teclado e apresento no terminal console*/
		/*System.out.println("=== Digite textos na mesma linha divida por quebra de linha ========");

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		
		System.out.println("Digite 1° texto: "); 
		s1 = sc.nextLine();// [NextLine]-leio o texto até a quebra de linha inteira
		
		System.out.println("Digite 2° texto: "); 
		s2 = sc.nextLine();
		
		System.out.println("Digite 3° texto:"); 
		s3 = sc.nextLine();

		System.out.println("\n---| RESULTADO - DADOS DIGITADOS: |---");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close(); */
		
		
		//# Exemplo 07 -----------------------------------------------------------------------------
		/* Para ler um Até a Quebra de linha Pendente- pego valor do teclado e apresento no terminal console*/
		System.out.println("=== Digite textos na mesma linha divida por quebra de linha Pendente ========");

		Scanner sc = new Scanner(System.in);
        
		int x;
		String s1, s2, s3;
		
		System.out.println("Digite um Numero: "); 
		x = sc.nextInt(); // Cenario: Ao digitar valor INT- apertar button ente da uma quebra linha Pendente
		sc.nextLine();    // add  proximo NextLine(), consume a quebra de linha que ficou pendente limpo buffer vazia .
		
		System.out.println("Digite 1° texto: "); 
		s1 = sc.nextLine();// [NextLine()]-leio o texto até a quebra de linha inteira
		
		System.out.println("Digite 2° texto: "); 
		s2 = sc.nextLine();
		
		System.out.println("Digite 3° texto:"); 
		s3 = sc.nextLine();

		System.out.println("\n---| RESULTADO - DADOS DIGITADOS: |---");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();			
	}
}
/*Resumo:  
 * Operadores
 * Scanner
 * next()
 * nextInt()
 * nextDouble()
 * next().charAt(0)
 * Locale
 * Como ler até a quebra de linha
 * nextLine()
 * como limpar o buffer de leitura
 *  
 *  */
