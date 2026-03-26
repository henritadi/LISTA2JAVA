package Lista02;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("digite a temperatura");
		num=receba.nextInt();
	
		if (num < 15) {
			System.out.println("frio");
		}else if( num >= 15 && num <=25 ) {
			System.out.println("Agradavel");
		}else {
			System.out.println("Positivo");
		}

	}

}
