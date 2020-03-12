package algoritmo01;

import java.util.Scanner;

public class Ex8 {

	public static void main() {
		Integer a, b,c,d; 

		System.out.println("Digite um numero A");
		Scanner input0 = new Scanner(System.in);
		a = Integer.valueOf(input0.nextLine().toString());
//		System.out.println("Você digitou: "+a);
//		System.out.println("------------------------------");
		
		System.out.println("Digite um novo numero B");
		Scanner input1 = new Scanner(System.in);
		b = Integer.valueOf(input1.nextLine().toString());
		
		System.out.println("Digite um novo numero C");
		Scanner input2 = new Scanner(System.in);
		c = Integer.valueOf(input1.nextLine().toString());
		
		System.out.println("Digite um novo numero D");
		Scanner input3 = new Scanner(System.in);
		d = Integer.valueOf(input1.nextLine().toString());
		
		System.out.println("Resultados");
		System.out.println("------------------------------");
		
		
		System.out.println("# Soma");
		System.out.println("A+B: "+(a+b));
		System.out.println("A+C: "+(a+c));
		System.out.println("A+D: "+(a+d));
		
		System.out.println("# Multiplicação");
		System.out.println("A*B: "+(a*b));
		System.out.println("A*C: "+(a*c));
		System.out.println("A*D: "+(a*d));
		
	
	}

}
