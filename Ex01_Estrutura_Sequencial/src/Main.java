import java.util.Scanner;

// Exerc�cio 01 - se��o 04 Estrutura Sequencial

//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
//mensagem explicativa, conforme exemplos.


public class Main {

	public static void main(String[] args) {
		
   System.out.println("=== Digite o valor 2 numeros de entrda e veja saida ========");
		
   Scanner sc = new Scanner(System.in);	
		
   int n1,n2;
   double soma;

 
   
   System.out.println("\n---| RESULTADO - DADOS ENTRADAS: |---"); 
   
   System.out.println("Digite 1� Valor Entrada: "); 
   n1 = sc.nextInt();
   
   System.out.println("Digite 2� Valor Entrada: "); 
   n2=  sc.nextInt();
   
   System.out.println("\n---| RESULTADO - DADOS SAIDA: |---"); 
   
   soma = n1 + n2;
   System.out.printf("SAIDA: %.0f%n ",soma );

   
   
   
   
		
		
		

	}

}
