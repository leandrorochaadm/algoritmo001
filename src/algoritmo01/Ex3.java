package algoritmo01;

import java.util.Scanner;

public class Ex3 {

	public static void main() {
		Double sb, td, sl, ht, vh, pd;

		System.out.println("Digite as horas trabalhadas no m�s");
		ht = 	Double.valueOf(new Scanner(System.in).nextLine());
//		System.out.println("Voc� digitou: "+a);
//		System.out.println("------------------------------");
		
		System.out.println("Digite o valor hora trabalha");
		vh = Double.valueOf(new Scanner(System.in).nextLine().toString());
		
		System.out.println("Digite o percentual de desconto");
		pd = Double.valueOf(new Scanner(System.in).nextLine().toString());
		
		sb = (double) (ht*vh);
		td = (( Double.valueOf(pd) /100)*sb);
		sl =  sb - td;
		
		System.out.println("Resultados :");
		System.out.println("------------------------------");
		System.out.println("Horas trabalhadas: "+ht);
		System.out.println("Sal�rio Bruto: "+sb);
		System.out.println("Desconto: "+td);
		System.out.println("Sal�rio Liquido: "+ sl);
	}

}
