package Lista02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("qual tua idade?");
		num=receba.nextInt();
		
		if (num < 12) {
			System.out.println("Criança");
		}else if( num >= 13 && num <=17 ) {
			System.out.println("Adolecente");
		}else {
			System.out.println("Adulto");

	}
	}

}
