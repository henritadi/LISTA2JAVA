package Lista02;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("informe um numero");
		num = receba.nextInt();
	
		if (num == 10 || num == 20) {
			System.out.println("Seu numero é especial");
		} else {
			System.out.println("Teu numero não especial");
			
		}
	}
}