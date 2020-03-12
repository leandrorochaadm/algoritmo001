package algoritmo01;

import java.util.Scanner;

public class Ex2 {

	public static void main() {
		Integer a, b,c; 

		System.out.println("Digite um numero, por gentileza");
		Scanner input0 = new Scanner(System.in);
		a = Integer.valueOf(input0.nextLine().toString());
//		System.out.println("Você digitou: "+a);
//		System.out.println("------------------------------");
		
		System.out.println("Digite um novo numero, por gentileza");
		Scanner input1 = new Scanner(System.in);
		b = Integer.valueOf(input1.nextLine().toString());
		System.out.println("Você digitou: " + a + " e o " + b);
		System.out.println("------------------------------");

		c= a+b;
		System.out.println("Após a inversão dos numero ficou assim :"+b+" e "+ a);
		
		System.out.println("------------------------------");
		Principal principal = new Principal();
		principal.main(null);
	}

}
