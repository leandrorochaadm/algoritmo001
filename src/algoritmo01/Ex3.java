package algoritmo01;

import java.util.Scanner;

public class Ex3 {

	public static void main() {
		Integer ht, vh, pd;
		Double sb, td, sl;

		System.out.println("Digite as horas trabalhadas no mês");
		Scanner input0 = new Scanner(System.in);
		ht = 	Integer.valueOf(input0.nextLine().toString());
//		System.out.println("Você digitou: "+a);
//		System.out.println("------------------------------");
		
		System.out.println("Digite o valor hora trabalha");
		Scanner input1 = new Scanner(System.in);
		vh = Integer.valueOf(input1.nextLine().toString());
		
		System.out.println("Digite o percentual de desconto");
		Scanner input2 = new Scanner(System.in);
		pd = Integer.valueOf(input2.nextLine().toString());
		
		sb = (double) (ht*vh);
		td = (( Double.valueOf(pd) /100)*sb);
		sl =  sb - td;
		
		System.out.println("Resultados :");
		System.out.println("------------------------------");
		System.out.println("Horas trabalhadas: "+ht);
		System.out.println("Salário Bruto: "+sb);
		System.out.println("Desconto: "+td);
		System.out.println("Salário Liquido: "+ sl);
	}

}
