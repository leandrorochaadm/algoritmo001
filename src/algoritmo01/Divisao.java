package algoritmo01;

import java.util.Scanner;

public class Divisao {
	public static void main () {
//		Integer a, b; 
		Double temp, a, b;

		System.out.println("Digite um numero, por gentileza");
		Scanner input0 = new Scanner(System.in);
		a = Double.valueOf(input0.nextLine().toString());
//		System.out.println("Voc� digitou: "+a);
//		System.out.println("------------------------------");
		
		System.out.println("Digite um novo numero, por gentileza");
		Scanner input1 = new Scanner(System.in);
		b = Double.valueOf(input1.nextLine().toString());
		System.out.println("Voc� digitou: " + a + " e o " + b);
		System.out.println("------------------------------");

		temp = a / b;
		System.out.println("Resultado da divis�o real: " + temp);

		temp = a / b;
		System.out.println("Resultado da divis�o Euclidiana: " + temp.intValue());

		temp = a % b;
		System.out.println("Resto da divis�o: " + temp);

	}

}
