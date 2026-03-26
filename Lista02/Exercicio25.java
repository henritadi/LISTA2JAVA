package Lista02;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("informe um numero");
		num = receba.nextInt();
	
		if (!(num == 0)) {
			System.out.println("Seu numero não é igual a 0");
		} else {
			System.out.println("Seu numero é igual a 0");
			
		}
	}
}