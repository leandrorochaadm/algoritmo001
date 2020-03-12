package algoritmo01;

import java.util.Scanner;

public class Ex4 {

	public static void main() {
		Integer c, f; 

		System.out.println("Digite a temperatura em graus Celsius");
		Scanner input0 = new Scanner(System.in);
		c = Integer.valueOf(input0.nextLine().toString());
		System.out.println("Você digitou: " + c + "ºC");

		f =(Integer) ((9*c+160)/5);
		System.out.println("Após a conversão a temperatura ficou em graus Fahrenheit: "+f+"F");
		
		System.out.println("------------------------------");
		Principal principal = new Principal();
		principal.main(null);
	}

}
