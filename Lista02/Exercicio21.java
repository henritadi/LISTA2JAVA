package Lista02;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("Fala tua idade:");
		num = receba.nextInt();
	
		if (num >= 18 && num < 70) {
			System.out.println("Você pode tirar carteira de motorista");
		} else {
			System.out.println("Você não pode tirar carteira de motorista");
			if(num >70);
			System.out.println("Pois tu tem mais de 70 anos.");
		}
	}
}