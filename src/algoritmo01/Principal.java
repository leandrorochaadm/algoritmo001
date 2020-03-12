package algoritmo01;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Digite o numero do exercício que deseja executar, entre 1 e 8");
		Scanner input = new Scanner(System.in);
		 int ex = input.nextInt();
//		 System.out.println(ex);
		 
		Divisao divisao = new Divisao();
		Ex1 ex1 = new Ex1();
		Ex2 ex2 = new Ex2();
		Ex3 ex3 = new Ex3();	 
		Ex4 ex4 = new Ex4();	 
		Ex5 ex5 = new Ex5();	 
		Ex6 ex6 = new Ex6();	 
		Ex7 ex7 = new Ex7();	 
		Ex8 ex8 = new Ex8();	 
		 
		 switch (ex) {
		case 1:  ex1.main(); ; break;
		case 2:  ex2.main() ; break;
		case 3:  ex3.main();break;
		case 4:  Ex4.main();break;
		case 5:  ex5.main();break;
		case 6:  ex6.main();break;
		case 7:  ex7.main();break;
		case 8:  ex8.main();break;

		default: divisao.main(); break;
		}

	}
}
