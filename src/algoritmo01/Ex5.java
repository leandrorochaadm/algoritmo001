package algoritmo01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {

	public static void main() {
//		Integer ht, vh, pd;
		Double litros_usados, t, d, v ;
		final Double consumo = 12.0;

		System.out.println("Digite o tempo gasto na viagem (h)");
		Scanner input0 = new Scanner(System.in);
		t = 	Double.valueOf(input0.nextLine().toString());
	
		System.out.println("Digite a velocidade média (km/h)");
		Scanner input1 = new Scanner(System.in);
		v = Double.valueOf(input1.nextLine().toString());
	
		
		d = t*v;
		litros_usados = d/consumo;
		String litros_usados_arrendodado = new DecimalFormat("#,##0.000").format(litros_usados);
			
		System.out.println("Resultados :");
		System.out.println("------------------------------");
		System.out.println("Quantidade de litros de combustível gasta na viagem: "+litros_usados_arrendodado+" litros");
		System.out.println("velocidade média: "+v+" Km/h");
		System.out.println("tempo gasto na viagem: "+t+" hora(s)");
		System.out.println("Consumo de "+consumo+" litros por km");
		
		System.out.println("------------------------------");
		Principal principal = new Principal();
		principal.main(null);
	}

}
