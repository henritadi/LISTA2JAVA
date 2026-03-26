package Lista02;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("Fala tua idade:");
		num = receba.nextInt();
	
		if (num >= 60 || num < 10) {
			System.out.println("Voçe pode ser atendido de prioritario");
		} else {
			System.out.println("Voçe não pode ser atendido de prioritario");
			if(num >70);
			System.out.println("Pois tu tem entre 10 a 60 anos.");
		}
	}
}