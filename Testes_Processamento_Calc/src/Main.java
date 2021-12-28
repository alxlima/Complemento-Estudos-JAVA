
public class Main {

	public static void main(String[] args) {
		
		/* -- modelo exemplo 01
	    int x, y;
				
		x = 5;
		
		y =2 * x;
		
		System.out.println(x); //result = 5
		System.out.println(y); //result= 10
		
		*/
		
		/* -- modelo exemplo 02
		
	   int x;
	   double y;
		
		x = 5;
		
		y =2 * x;
		
		System.out.println(x); //result = 5
		System.out.println(y); //result = 10.0

         */
		
		/* -- modelo exemplo 03 -- calc area trapezio 
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area); //result = 35.0
		*/
		
		
		/* -- modelo exemplo 04 -- calc area trapezio 
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = a / b; // este resultado trunca casa decimal. por ser a e b int.
		System.out.println(resultado); //result = 2.0
		
		resultado = (double)a / b; //- double é Casting conversão explícita de um tipo para outro. 2/5 = 2,5
		System.out.println(resultado); //result = 2.5
        */
		
		/* -- modelo exemplo 05 -- calc area trapezio  */
		double a;
		int b;
		a = 5.0;
		//b = a; //<< erro pois b é int
		b = (int) a; // incluir Casting
		
		System.out.println(b); //result = 5
		
	}	

}
