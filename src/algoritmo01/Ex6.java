package algoritmo01;

import java.util.Scanner;

public class Ex6 {

	public static void main() {
		Integer a, b,temp; 

		System.out.println("Digite um numero, por gentileza");
		Scanner input0 = new Scanner(System.in);
		a = Integer.valueOf(input0.nextLine().toString());
//		System.out.println("Você digitou: "+a);
//		System.out.println("------------------------------");
		
		System.out.println("Digite um novo numero, por gentileza");
		Scanner input1 = new Scanner(System.in);
		b = Integer.valueOf(input1.nextLine().toString());
		System.out.println("Você digitou:  A=" + a + " e o B=" + b);
		System.out.println("------------------------------");

		temp= a;
		a=b;
		b=temp;
		temp= null;
		System.out.println("Após a inversão dos numero ficou assim : A="+a+" e B="+ b);
	}

}
