package algoritmo01;

import java.util.Scanner;

public class Ex7 {

	public static void main() {
		Double x,q,c; 

		System.out.println("Digite um numero: ");
		Scanner input0 = new Scanner(System.in);
		x = Double.valueOf(input0.nextLine().toString());
		q = Math.pow(x, 2);
		c = Math.pow(x, 3);
		
		System.out.println("Numero elevado ao quadrado: "+q);
		System.out.println("Numero elevado ao cubo: "+c);
	}

}
